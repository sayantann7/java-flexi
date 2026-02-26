package com.sayantan.repository;

import com.sayantan.pojo.Actor;
import com.sayantan.pojo.Category;
import com.sayantan.pojo.MyFilm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepo {
    @Autowired
    private Database database;
    
    public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	
	public List<Category> findAll(){
    	Connection con = database.init();
        List<Category> categories = new ArrayList<Category>();
        try {
            Statement st = con.createStatement();
            String query = "select * from category";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
            	Category c = new Category();
            	c.setCategory_id(rs.getInt("category_id"));
            	c.setName(rs.getString("name"));
            	categories.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }
	
	public List<Category> find(String name) {
		Connection con = database.init();
		List<Category> categories = new ArrayList<Category>();
		try {
			Statement st = con.createStatement();
			String query = "select * from category where name like '%"+name+"%'";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()){
            	Category c = new Category();
            	c.setCategory_id(rs.getInt("category_id"));
            	c.setName(rs.getString("name"));
            	categories.add(c);
            }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return categories;
	}
	
	public int generateID() {
		Connection con = database.init();
		int lastId = 0;
		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String query = "select * from category";
			ResultSet rs = st.executeQuery(query);
			boolean success = rs.last(); 
			if (success) {
			    lastId = rs.getInt("category_id");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return (lastId+1);
	}
	
	public void add(String name) {
		Connection con = database.init();
		try {
			con.setAutoCommit(false);
			String sql = "insert into category (category_id, name) values (?,?) ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, generateID());
			pst.setString(2, name);
			int rowsAffected = pst.executeUpdate();
			con.commit();
			System.out.println("Inserted Category : rows affected : "+rowsAffected);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
