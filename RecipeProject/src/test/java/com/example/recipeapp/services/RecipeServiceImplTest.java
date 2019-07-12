package com.example.recipeapp.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.recipeapp.model.Recipe;
import com.example.recipeapp.repositories.RecipeRepository;

public class RecipeServiceImplTest
{
	RecipeService recipeService;

	@Mock
	RecipeRepository recipeRepo;

	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		recipeService = new RecipeServiceImpl(recipeRepo);
	}

	@Test
	public void testGetRecipes()
	{
		Set<Recipe> recipes = new HashSet<>();
		Recipe recipe = new Recipe();
		recipes.add(recipe);
		Mockito.when(recipeRepo.findAll()).thenReturn(recipes);

		Set<Recipe> actualResult = recipeService.getRecipes();
		Mockito.verify(recipeRepo, times(1)).findAll();
		assertEquals(1, actualResult.size());
	}
}
