package com.springcourse.jokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomQuoteService implements JokeService
{
    private final ChuckNorrisQuotes quotes;

    public RandomQuoteService()
    {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke()
    {
        return quotes.getRandomQuote();
    }
}
