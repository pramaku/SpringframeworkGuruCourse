package com.springcourse.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springcourse.di.controller.ConstructorInjectorController;
import com.springcourse.di.controller.PropertyInjectionController;
import com.springcourse.di.controller.ServiceFactoryBasedController;
import com.springcourse.di.controller.SetterInjectionController;
import com.springcourse.di.service.DataSource;
import com.springcourse.di.service.JmsSource;

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

        DataSource dataSource = cxt.getBean(DataSource.class);
        System.out.println(dataSource.getUser());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getUrl());
        System.out.println(dataSource.getEnv());

        JmsSource jmsSource = cxt.getBean(JmsSource.class);
        System.out.println(jmsSource.getUser());
        System.out.println(jmsSource.getPassword());
        System.out.println(jmsSource.getQueueName());
    }
}
