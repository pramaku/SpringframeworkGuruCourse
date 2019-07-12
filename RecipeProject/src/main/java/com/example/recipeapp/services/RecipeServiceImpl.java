package com.example.recipeapp.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.recipeapp.model.Recipe;
import com.example.recipeapp.repositories.RecipeRepository;

@Service	
public class RecipeServiceImpl implements RecipeService 
{
	private final RecipeRepository recipeRepo;

	public RecipeServiceImpl(RecipeRepository recipeRepo)
	{
		this.recipeRepo = recipeRepo;
	}

	@Override
	public Set<Recipe> getRecipes()
	{
		Set<Recipe> recipes = new HashSet<>();
		recipeRepo.findAll().iterator().forEachRemaining(recipes::add);
		return recipes;
	}
}
