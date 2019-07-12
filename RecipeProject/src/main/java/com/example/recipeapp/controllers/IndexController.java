package com.example.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.recipeapp.services.RecipeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController
{
	private final RecipeService recipeService;

    public IndexController(RecipeService recipeService)
    {
        this.recipeService = recipeService;
    }
    
	@RequestMapping({"", "/", "/recipes"})
	public String getIndexPage(Model model)
	{
		log.info("GET call for root service");
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
}
