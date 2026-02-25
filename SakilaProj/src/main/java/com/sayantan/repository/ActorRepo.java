package com.sayantan.repository;

import com.sayantan.pojo.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ActorRepo {
    @Autowired
    private Database database;
    
    public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public List<Actor> findAll(){
    	Connection con = database.init();
        List<Actor> actors = new ArrayList<Actor>();
        try {
            Statement st = con.createStatement();
            String query = "select * from actor";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Actor a = new Actor();
                a.setActor_id(rs.getInt("actor_id"));
                a.setFirst_name(rs.getString("first_name"));
                a.setLast_name(rs.getString("last_name"));
                actors.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return actors;
    }
	
	public List<Actor> find(String name) {
		Connection con = database.init();
		List<Actor> actors = new ArrayList<Actor>();
		try {
			Statement st = con.createStatement();
			String query = "select * from actor where first_name like '%"+name+"%' or last_name like '%"+name+"%'";
			ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Actor a = new Actor();
                a.setActor_id(rs.getInt("actor_id"));
                a.setFirst_name(rs.getString("first_name"));
                a.setLast_name(rs.getString("last_name"));
                actors.add(a);
            }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return actors;
	}

}
