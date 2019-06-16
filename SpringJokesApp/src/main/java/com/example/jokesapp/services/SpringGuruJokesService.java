package com.example.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class SpringGuruJokesService 
{
	private ChuckNorrisQuotes quotes =  new ChuckNorrisQuotes();

	public String getRandomJoke()
	{
		return quotes.getRandomQuote();
	}
}
