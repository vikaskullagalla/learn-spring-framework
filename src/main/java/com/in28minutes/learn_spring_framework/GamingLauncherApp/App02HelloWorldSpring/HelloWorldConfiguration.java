package com.in28minutes.learn_spring_framework.GamingLauncherApp.App02HelloWorldSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Hello World";
    }
}
