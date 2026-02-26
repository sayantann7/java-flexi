package com.sayantan.repository;

import com.sayantan.pojo.Actor;
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
public class FilmRepo {
    @Autowired
    private Database database;
    
    
    
    public Database getDb() {
		return database;
	}



	public void setDb(Database database) {
		this.database = database;
	}



	public List<MyFilm> findAll(){
    	Connection con = database.init();
        List<MyFilm> films = new ArrayList<MyFilm>();
        try {
            Statement st = con.createStatement();
            String query = "select * from myfilm";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
            	MyFilm f = new MyFilm();
            	f.setFilm_id(rs.getInt("film_id"));
            	f.setTitle(rs.getString("title"));
            	f.setDescription(rs.getString("description"));
            	f.setLength(rs.getInt("length"));
            	f.setRating(rs.getString("rating"));
            	f.setRelease_year(rs.getString("release_year"));
                films.add(f);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return films;
    }
	
	public List<MyFilm> find(String name) {
		Connection con = database.init();
		List<MyFilm> films = new ArrayList<MyFilm>();
		try {
			Statement st = con.createStatement();
			String query = "select * from myfilm where title like '%"+name+"%' or description like '%"+name+"%'";
			ResultSet rs = st.executeQuery(query);
            while(rs.next()){
            	MyFilm f = new MyFilm();
            	f.setFilm_id(rs.getInt("film_id"));
            	f.setTitle(rs.getString("title"));
            	f.setDescription(rs.getString("description"));
            	f.setLength(rs.getInt("length"));
            	f.setRating(rs.getString("rating"));
            	f.setRelease_year(rs.getString("release_year"));
                films.add(f);
            }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return films;
	}
	
	public MyFilm findByID(int id) {
		Connection con = database.init();
		MyFilm f = new MyFilm();
		try {
			Statement st = con.createStatement();
			String query = "select * from myfilm where film_id="+id;
			ResultSet rs = st.executeQuery(query);
            rs.next();
        	f.setFilm_id(rs.getInt("film_id"));
        	f.setTitle(rs.getString("title"));
        	f.setDescription(rs.getString("description"));
        	f.setLength(rs.getInt("length"));
        	f.setRating(rs.getString("rating"));
        	f.setRelease_year(rs.getString("release_year"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return f;
	}
	
	public int generateID() {
		Connection con = database.init();
		int lastId = 0;
		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String query = "select * from myfilm";
			ResultSet rs = st.executeQuery(query);
			boolean success = rs.last(); 
			if (success) {
			    lastId = rs.getInt("film_id");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return (lastId+1);
	}
	
	public void add(String title, String description, String release_year, int length, String rating, int category_id) {
		Connection con = database.init();
		try {
			con.setAutoCommit(false);
			String sql = "insert into myfilm (film_id, title, description, release_year, rating) values (?,?,?,?,?) ";
			PreparedStatement pst = con.prepareStatement(sql);
			int film_id = generateID();
			pst.setInt(1, film_id);
			pst.setString(2, title);
			pst.setString(3, description);
			pst.setString(4, release_year);
			pst.setString(5, rating);
			int rowsAffected = pst.executeUpdate();
			con.commit();
			System.out.println("Inserted Film : rows affected : "+rowsAffected);
			
			String sql2 = "insert into film_category (film_id, category_id) values (?,?) ";
			PreparedStatement pst2 = con.prepareStatement(sql2);
			pst2.setInt(1, film_id);
			pst2.setInt(2, category_id);
			pst2.executeUpdate();
			con.commit();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}



	public List<MyFilm> filterByCategory(int categoryId) {
		Connection con = database.init();
        List<MyFilm> films = new ArrayList<MyFilm>();
        try {
            Statement st = con.createStatement();
            String query = "select * from film_category where category_id="+categoryId;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
            	int film_id = rs.getInt("film_id");
            	MyFilm f = findByID(film_id);
                films.add(f);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return films;
	}

}
