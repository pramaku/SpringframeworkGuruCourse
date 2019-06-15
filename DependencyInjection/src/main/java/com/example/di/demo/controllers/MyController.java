package com.example.di.demo.controllers;

import org.springframework.stereotype.Controller;

import com.example.di.demo.services.GreetingService;

@Controller
public class MyController
{
	private GreetingService greethingService;
	
	public MyController(GreetingService greetingService)
	{
		this.greethingService = greetingService;
	}
	public void getHome()
	{
		System.out.println(greethingService.sayGreeting());
	}
}
