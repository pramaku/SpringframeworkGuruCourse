package com.springcourse.di.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.springcourse.di.controller.ConstructorInjectorController;
import com.springcourse.di.service.HiGreetingServiceImpl;

public class ConstructorInjectorControllerTest
{

    @Test
    public void testGetGreeting()
    {
        ConstructorInjectorController controller = new ConstructorInjectorController(new HiGreetingServiceImpl());
        assertEquals(HiGreetingServiceImpl.GREETING_SERVICE_IMPL_HELLO, controller.getGreeting());
    }

}
