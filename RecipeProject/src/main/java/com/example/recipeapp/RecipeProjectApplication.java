package com.example.recipeapp;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.recipeapp.model.Category;
import com.example.recipeapp.repositories.CategoryRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class RecipeProjectApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(RecipeProjectApplication.class, args);
		
		CategoryRepository repo = cxt.getBean(CategoryRepository.class);
		Optional<Category> c1 = repo.findByDescription("Fast Food");
		if (c1.isPresent())
		{
			Category c2 = c1.get();
			log.info(c2.getId() + "");
		}
	}

}
