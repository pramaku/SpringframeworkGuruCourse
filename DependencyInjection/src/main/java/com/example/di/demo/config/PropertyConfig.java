package com.example.di.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig
{
	@Value("${guru.username}")
	String user;

	@Value("${guru.password}")
	String password;

	@Value("${guru.url}")
	String url;

	@Autowired
	Environment env;

	@Bean
	public FakeDataSource dataSource()
	{
		FakeDataSource dataSource =  new FakeDataSource();
		dataSource.setUser(user);
		dataSource.setPass(password);
		dataSource.setUrl(url);
		return dataSource;
	}

/*
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties()
	{
		PropertySourcesPlaceholderConfigurer propConfig = new PropertySourcesPlaceholderConfigurer();
		return propConfig;
	}
	*/
}
