package com.example.di.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.di.demo.services.GreetingService;
import com.example.di.demo.services.GreetingServiceFactory;

@Configuration
public class GereetingServiceConfig
{
	@Bean
	public GreetingServiceFactory greetingServiceFactory()
	{
		return new GreetingServiceFactory();
	}
	
	@Bean
	@Primary
	public GreetingService hiGreetingService()
	{
		return greetingServiceFactory().createGreetingService("");
	}

	@Bean
	@Profile({"en", "default"})
	public GreetingService englishGreetingService()
	{
		return greetingServiceFactory().createGreetingService("en");
	}

	@Bean
	@Profile("es")
	public GreetingService spanishGreetingService()
	{
		return greetingServiceFactory().createGreetingService("es");
	}
}
