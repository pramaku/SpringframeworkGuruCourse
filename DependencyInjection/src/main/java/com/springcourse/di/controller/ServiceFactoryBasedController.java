package com.springcourse.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springcourse.di.service.GreetingService;
import com.springcourse.di.service.GreetingServiceFactory;

@Controller
public class ServiceFactoryBasedController implements InjectionController
{
    private GreetingService greetingService;

    @Autowired
    public ServiceFactoryBasedController(GreetingServiceFactory serviceFactory)
    {
        greetingService = serviceFactory.getPrimaryGreetingService("en");
    }

    @Override
    public String getGreeting()
    {
        return greetingService.greet();
    }

}
