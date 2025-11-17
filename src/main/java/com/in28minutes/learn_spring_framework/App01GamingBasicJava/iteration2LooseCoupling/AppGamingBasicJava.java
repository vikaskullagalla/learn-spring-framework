package com.in28minutes.learn_spring_framework.App01GamingBasicJava.iteration2LooseCoupling;

import com.in28minutes.learn_spring_framework.App01GamingBasicJava.iteration2LooseCoupling.game.GameRunner;
import com.in28minutes.learn_spring_framework.App01GamingBasicJava.iteration2LooseCoupling.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args){

        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();//run() is a method of GameRunner class
    }
}
