package com.example.di.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class SpanishGreetngServiceImpl implements GreetingService
{
	private String greeting;
	
	public SpanishGreetngServiceImpl()
	{
		this.greeting = "Hello Gurus In Spanish";
	}
	
	public SpanishGreetngServiceImpl(String greeting)
	{
		this.greeting = greeting;
	}
	
	@Override
	public String sayGreeting()
	{
		return greeting;
	}
}
