package com.example.di.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.di.demo.services.GreetingService;

@Controller
public class SetterInjectedController
{
	private GreetingService greetingService;

	@Autowired
	public void setGreetingService(@Qualifier("hiGreetingServiceImpl") GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
