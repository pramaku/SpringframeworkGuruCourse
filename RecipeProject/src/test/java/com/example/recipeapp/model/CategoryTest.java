package com.example.recipeapp.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest
{
	Category category;

	@Before
	public void setUp() throws Exception
	{
		category = new Category();
	}

	@Test
	public void getId()
	{
		Long value = 2L;
		category.setId(2L);
		assertEquals(value, category.getId());
	}
}
