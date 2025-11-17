package com.in28minutes.learn_spring_framework.App01GamingBasicJava.iteration1TightCoupling;

import com.in28minutes.learn_spring_framework.App01GamingBasicJava.iteration1TightCoupling.game.GameRunner;
import com.in28minutes.learn_spring_framework.App01GamingBasicJava.iteration1TightCoupling.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args){

//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();//run() is a method of GameRunner class
    }
}
