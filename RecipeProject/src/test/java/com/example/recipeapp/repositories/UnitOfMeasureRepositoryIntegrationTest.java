package com.example.recipeapp.repositories;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.recipeapp.model.UnitOfMeasure;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIntegrationTest
{
	@Autowired
	UnitOfMeasureRepository uomRepo;

	@Before
	public void setUp() throws Exception
	{
		
	}

	@Test
	public void testFindByDescription()
	{
		UnitOfMeasure uom = uomRepo.findByDescription("Tablespoon").get();
		assertEquals("Tablespoon", uom.getDescription());
	}

	@Test
	public void testFindByDescriptionCup()
	{
		UnitOfMeasure uom = uomRepo.findByDescription("Cup").get();
		assertEquals("Cup", uom.getDescription());
	}
}
