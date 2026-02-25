package com.sayantan.service;

import com.sayantan.pojo.Actor;
import com.sayantan.repository.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    ActorRepo actorRepo;

    public List<Actor> fetchAllActors(){
        return actorRepo.findAll();
    }
    
    public List<Actor> fetchActor(String name){
    	String upperName = name.toUpperCase();
        return actorRepo.find(upperName);
    }

}
