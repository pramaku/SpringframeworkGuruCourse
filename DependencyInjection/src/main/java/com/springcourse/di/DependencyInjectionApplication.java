package com.springcourse.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springcourse.di.controller.ConstructorInjectorController;
import com.springcourse.di.controller.PropertyInjectionController;
import com.springcourse.di.controller.ServiceFactoryBasedController;
import com.springcourse.di.controller.SetterInjectionController;

@SpringBootApplication
public class DependencyInjectionApplication
{
    public static void main(String[] args)
    {
        ApplicationContext cxt = SpringApplication.run(DependencyInjectionApplication.class, args);
        System.out.println(cxt.getBean(PropertyInjectionController.class).getGreeting());
        System.out.println(cxt.getBean(SetterInjectionController.class).getGreeting());
        System.out.println(cxt.getBean(ConstructorInjectorController.class).getGreeting());
        System.out.println(cxt.getBean(ServiceFactoryBasedController.class).getGreeting());

    }
}
