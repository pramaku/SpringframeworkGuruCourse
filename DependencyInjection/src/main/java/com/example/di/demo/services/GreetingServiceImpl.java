package com.example.di.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService
{
	private String greeting;
	
	public GreetingServiceImpl()
	{
		this.greeting = "Hello Gurus";
	}
	
	public GreetingServiceImpl(String greeting)
	{
		this.greeting = greeting;
	}

	@Override
	public String sayGreeting()
	{
		return greeting;
	}
}
