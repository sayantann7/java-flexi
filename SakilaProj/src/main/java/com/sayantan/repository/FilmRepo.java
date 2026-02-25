package com.sayantan.repository;

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

}
