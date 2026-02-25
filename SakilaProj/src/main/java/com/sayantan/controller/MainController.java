package com.sayantan.controller;

import com.sayantan.pojo.Actor;
import com.sayantan.pojo.Category;
import com.sayantan.pojo.MyFilm;
import com.sayantan.service.ActorService;
import com.sayantan.service.CategoryService;
import com.sayantan.service.FilmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    ActorService actorService;
    @Autowired
    FilmService filmService;
    @Autowired
    CategoryService categoryService;
    
    @ModelAttribute("actors")
    public List<Actor> actors(){
    	return actorService.fetchAllActors();
    }
    
    @ModelAttribute("films")
    public List<MyFilm> films(){
    	return filmService.fetchAllFilms();
    }
    
    @ModelAttribute("categories")
    public List<Category> categories(){
    	return categoryService.fetchAllCategories();
    }

    @RequestMapping("/")
    public ModelAndView home(ModelAndView mv){
        mv.setViewName("index.jsp");
        return mv;
    }
    
    @RequestMapping("/actors")
    public ModelAndView actorPage(ModelAndView mv){
        mv.setViewName("actors.jsp");
        return mv;
    }
    
    @RequestMapping("/films")
    public ModelAndView filmPage(ModelAndView mv){
        mv.setViewName("films.jsp");
        return mv;
    }
    
    @RequestMapping("/categories")
    public ModelAndView categoryPage(ModelAndView mv){
        mv.setViewName("categories.jsp");
        return mv;
    }
    
    @RequestMapping("/searchActor")
    public ModelAndView searchActor(String name, ModelAndView mv){
    	mv.addObject("actors",actorService.fetchActor(name));
        mv.setViewName("actors.jsp");
        return mv;
    }
    
    @RequestMapping("/searchFilm")
    public ModelAndView searchFilm(String name, ModelAndView mv){
    	mv.addObject("films",filmService.fetchFilm(name));
        mv.setViewName("films.jsp");
        return mv;
    }
    
    @RequestMapping("/searchCategory")
    public ModelAndView searchCategory(String name, ModelAndView mv){
    	mv.addObject("categories",categoryService.fetchCategory(name));
        mv.setViewName("categories.jsp");
        return mv;
    }
}
