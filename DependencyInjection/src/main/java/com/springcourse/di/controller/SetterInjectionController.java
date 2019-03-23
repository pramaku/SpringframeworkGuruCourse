package com.springcourse.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springcourse.di.service.GreetingService;

@Controller
public class SetterInjectionController implements InjectionController
{

    private GreetingService greetingService;

    @Override
    public String getGreeting()
    {
        return greetingService.greet();
    }

    @Autowired
    public void setGreetingService(@Qualifier("helloGreetingServiceImpl") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
}
