package com.sayantan.repository;

import com.sayantan.pojo.Category;
import com.sayantan.pojo.MyFilm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
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

}
