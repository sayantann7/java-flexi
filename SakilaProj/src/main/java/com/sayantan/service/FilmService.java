package com.sayantan.service;

import com.sayantan.pojo.MyFilm;
import com.sayantan.repository.FilmRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmRepo filmRepo;

    public List<MyFilm> fetchAllFilms(){
        return filmRepo.findAll();
    }
    
    public List<MyFilm> fetchFilm(String name){
        return filmRepo.find(name);
    }

}
