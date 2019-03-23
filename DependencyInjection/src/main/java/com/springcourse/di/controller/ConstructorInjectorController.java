package com.springcourse.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springcourse.di.service.GreetingService;

@Controller
public class ConstructorInjectorController implements InjectionController
{
    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectorController(@Qualifier("helloGreetingServiceImpl") GreetingService hiGreetingServiceImpl)
    {
        super();
        this.greetingService = hiGreetingServiceImpl;
    }

    @Override
    public String getGreeting()
    {
        return greetingService.greet();
    }
}
