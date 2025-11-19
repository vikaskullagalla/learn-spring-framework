package com.in28minutes.learn_spring_framework.GamingLauncherApp.App03GamingSpringBeanJava;

import com.in28minutes.learn_spring_framework.GamingLauncherApp.App03GamingSpringBeanJava.game.GameRunner;
import com.in28minutes.learn_spring_framework.GamingLauncherApp.App03GamingSpringBeanJava.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeanJava {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();


    }
}
