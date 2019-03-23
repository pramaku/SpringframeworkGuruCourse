package com.springcourse.jokesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcourse.jokesapp.service.JokeService;

@Controller
public class RandomQuoteController
{
    private JokeService quoteService;

    @Autowired
    public RandomQuoteController(JokeService quoteService)
    {
        this.quoteService = quoteService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getRandomeQuote(Model model)
    {
        String joke = quoteService.getRandomJoke();
        // System.out.println(joke);
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
