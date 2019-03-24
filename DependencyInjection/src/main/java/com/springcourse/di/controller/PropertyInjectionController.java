package com.springcourse.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springcourse.di.service.GreetingService;

@Controller
public class PropertyInjectionController implements InjectionController
{
    @Autowired
    @Qualifier("hiGreetingServiceImpl")
    GreetingService hiGreetingServiceImpl;

    @Override
    public String getGreeting()
    {
        return hiGreetingServiceImpl.greet();
    }
}
