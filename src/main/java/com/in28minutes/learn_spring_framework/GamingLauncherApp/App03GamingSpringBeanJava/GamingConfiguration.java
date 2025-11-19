package com.in28minutes.learn_spring_framework.GamingLauncherApp.App03GamingSpringBeanJava;

import com.in28minutes.learn_spring_framework.GamingLauncherApp.App03GamingSpringBeanJava.game.GameRunner;
import com.in28minutes.learn_spring_framework.GamingLauncherApp.App03GamingSpringBeanJava.game.GamingConsole;
import com.in28minutes.learn_spring_framework.GamingLauncherApp.App03GamingSpringBeanJava.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new SuperContraGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
