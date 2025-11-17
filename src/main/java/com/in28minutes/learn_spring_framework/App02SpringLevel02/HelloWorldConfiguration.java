package com.in28minutes.learn_spring_framework.App02SpringLevel02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Vikas";
    }

    @Bean
    public int age(){
        return 28;
    }

    @Bean
    public Person personMethodCall(){
        return new Person(name(),age(),address()); //1. Method Call
    }

    @Bean
    public Person personMethodParameter(String name, int age, Address address){
        return new Person(name,age,address); //2. Method Parameter
    }

    @Bean
    public Address address(){
        return new Address("Inner Valley", "Bangalore");
    }
}
