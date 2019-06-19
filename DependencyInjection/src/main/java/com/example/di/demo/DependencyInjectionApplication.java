package com.example.di.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.di.demo.config.FakeDataSource;
import com.example.di.demo.controllers.ConstructorInjectedController;
import com.example.di.demo.controllers.MyController;
import com.example.di.demo.controllers.PropertyInjectedController;
import com.example.di.demo.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication
{
	public static void main(String[] args)
	{
		ApplicationContext cxt = SpringApplication.run(DependencyInjectionApplication.class, args);
		cxt.getBean(MyController.class).getHome(); // By Class Name
		System.out.println(cxt.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(cxt.getBean(SetterInjectedController.class).sayHello());
		System.out.println(cxt.getBean(ConstructorInjectedController.class).sayHello());
		
		System.out.println(cxt.getBean(FakeDataSource.class));
	}
}
