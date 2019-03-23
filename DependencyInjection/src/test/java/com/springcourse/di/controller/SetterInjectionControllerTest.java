package com.springcourse.di.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.springcourse.di.service.HiGreetingServiceImpl;

public class SetterInjectionControllerTest
{
    @Test
    public void testGetGreeting()
    {
        SetterInjectionController controller = new SetterInjectionController();
        controller.setGreetingService(new HiGreetingServiceImpl());
        assertEquals(HiGreetingServiceImpl.GREETING_SERVICE_IMPL_HELLO, controller.getGreeting());
    }

}
