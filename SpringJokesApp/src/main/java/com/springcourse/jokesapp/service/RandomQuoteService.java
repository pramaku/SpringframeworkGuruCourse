package com.springcourse.jokesapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Service
public class RandomQuoteService implements JokeService
{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public RandomQuoteService(ChuckNorrisQuotes chuckNorrisQuotes)
    {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomJoke()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
