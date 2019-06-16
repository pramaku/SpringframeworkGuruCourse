package com.example.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jokesapp.services.SpringGuruJokesService;

@Controller
public class JokesController
{

	private SpringGuruJokesService jokesService;

	public JokesController(SpringGuruJokesService jokesService)
	{
		this.jokesService = jokesService;
	}

	@RequestMapping("/")
	public String getRandomJoke(Model model)
	{
		model.addAttribute("joke", jokesService.getRandomJoke());
		return "chucknorris";
	}
}
