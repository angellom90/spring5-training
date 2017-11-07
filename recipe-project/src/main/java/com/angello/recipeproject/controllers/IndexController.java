package com.angello.recipeproject.controllers;

import com.angello.recipeproject.domain.Category;
import com.angello.recipeproject.domain.UnitOfMeasure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.angello.recipeproject.repositories.CategoryRepository;
import com.angello.recipeproject.repositories.UnitOfMeasureRepository;


import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
