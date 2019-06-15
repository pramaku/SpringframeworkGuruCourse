package com.example.di.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.di.demo.services.GreetingService;

@Controller
public class PropertyInjectedController
{
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingService;
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}

	/*
	public GreetingServiceImpl getGreetingService()
	{
		return greetingService;
	}
	*/
}
