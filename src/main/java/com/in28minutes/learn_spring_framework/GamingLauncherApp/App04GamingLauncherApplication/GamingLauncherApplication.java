package com.in28minutes.learn_spring_framework.GamingLauncherApp.App04GamingLauncherApplication;

import com.in28minutes.learn_spring_framework.GamingLauncherApp.App04GamingLauncherApplication.game.GameRunner;
import com.in28minutes.learn_spring_framework.GamingLauncherApp.App04GamingLauncherApplication.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingLauncherApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(GamingLauncherApplication.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
        catch (Exception ex){
            ex.getMessage();
        }

    }
}
