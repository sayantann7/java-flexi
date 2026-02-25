package com.sayantan.service;

import com.sayantan.pojo.Category;
import com.sayantan.repository.CategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    public List<Category> fetchAllCategories(){
        return categoryRepo.findAll();
    }

}
