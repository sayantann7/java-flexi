package com.sayantan.repository;

import com.sayantan.pojo.Actor;
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
	
	public int generateID() {
		Connection con = database.init();
		int lastId = 0;
		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String query = "select * from actor";
			ResultSet rs = st.executeQuery(query);
			boolean success = rs.last(); 
			if (success) {
			    lastId = rs.getInt("actor_id");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return (lastId+1);
	}
	
	public void add(String first_name, String last_name) {
		Connection con = database.init();
		try {
			con.setAutoCommit(false);
			String sql = "insert into actor (actor_id, first_name, last_name) values (?,?,?) ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, generateID());
			pst.setString(2, first_name);
			pst.setString(3, last_name);
			int rowsAffected = pst.executeUpdate();
			con.commit();
			System.out.println("Inserted Actor : rows affected : "+rowsAffected);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
