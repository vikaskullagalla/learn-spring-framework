package com.in28minutes.learn_spring_framework.GamingLauncherApp.App02SpringLevel01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String firstLine, String city){};
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
    public Person person(){
        return new Person("Sumanth",29);
    }

    @Bean
    public Address address(){
        return new Address("Inner Valley", "Bglr");
    }
}
