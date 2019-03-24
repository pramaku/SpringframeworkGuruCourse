package com.springcourse.di.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.springcourse.di.controller.PropertyInjectionController;
import com.springcourse.di.service.HiGreetingServiceImpl;

public class PropertyInjectionControllerTest
{
    @Test
    public void testgetGreeting()
    {
        PropertyInjectionController controller = new PropertyInjectionController();
        controller.hiGreetingServiceImpl = new HiGreetingServiceImpl();

        assertEquals(HiGreetingServiceImpl.GREETING_SERVICE_IMPL_HELLO, controller.getGreeting());
    }
}
