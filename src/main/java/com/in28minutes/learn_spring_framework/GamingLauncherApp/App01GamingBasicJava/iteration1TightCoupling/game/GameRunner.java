package com.in28minutes.learn_spring_framework.GamingLauncherApp.App01GamingBasicJava.iteration1TightCoupling.game;

public class GameRunner {
    SuperContraGame game; //to run marioGame change it to marioGame
    public GameRunner(SuperContraGame game) { //to run marioGame change it to marioGame
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
