package com.example.recipeapp.controllers;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import com.example.recipeapp.model.Recipe;
import com.example.recipeapp.services.RecipeService;

public class IndexControllerTest
{
	@Mock
	RecipeService recipeService;

	@Mock
	Model model;

	IndexController controller;

	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		controller = new IndexController(recipeService);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGetIndexPage()
	{
		Set<Recipe> recipes = new HashSet<>();
		Recipe recipe = new Recipe();
		recipes.add(recipe);
		Recipe recipe1 = new Recipe();
		recipe1.setId(2L);
		recipes.add(recipe1);
		Mockito.when(recipeService.getRecipes()).thenReturn(recipes);

		ArgumentCaptor<Set<Recipe>> attrValueArgCaptor = ArgumentCaptor.forClass(Set.class);
		ArgumentCaptor<String> attrArgCaptor = ArgumentCaptor.forClass(String.class);
		// then
		assertEquals("index", controller.getIndexPage(model));
		Mockito.verify(recipeService, Mockito.times(1)).getRecipes();
		Mockito.verify(model, Mockito.times(1)).addAttribute(attrArgCaptor.capture(), attrValueArgCaptor.capture());
		String modelAtribute = attrArgCaptor.getValue();
		Set<Recipe> arguments = attrValueArgCaptor.getValue();
		assertEquals("recipes", modelAtribute);
		assertEquals(2, arguments.size());
	}

	@Test
	public void testMockMVC() throws Exception
	{
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("index"));

		mockMvc.perform(get(""))
			.andExpect(status().isOk())
			.andExpect(view().name("index"));

		mockMvc.perform(get("/recipes"))
			.andExpect(status().isOk())
			.andExpect(view().name("index"));
		
		mockMvc.perform(get("/index"))
			.andExpect(status().isNotFound());
	}
}
