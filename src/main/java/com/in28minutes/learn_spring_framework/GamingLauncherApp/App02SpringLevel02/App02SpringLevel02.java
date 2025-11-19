package com.in28minutes.learn_spring_framework.GamingLauncherApp.App02SpringLevel02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringLevel02 {
    public static void main(String[] args){
        // 1. Launch a Spring Context
        var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Configure the things that we want Spring to manage
        //GamingConfiguration - @Configuration
        //name() - @Bean

        // 3. Retrieve Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("personMethodCall"));
        System.out.println(context.getBean("personMethodParameter"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean(Address.class));
//        System.out.println(context.getBean(Person.class));//Will throw exception as there are multiple beans of type Person
    }
}
