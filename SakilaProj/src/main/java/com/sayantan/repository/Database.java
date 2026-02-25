package com.sayantan.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;

@Repository
public class Database {
    private String url = "jdbc:mysql://localhost:3306/sakila";
    private String username = "sayantan";
    private String password = "sayantan";
    private Connection con;

    public Connection init(){
        try{
            con = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
