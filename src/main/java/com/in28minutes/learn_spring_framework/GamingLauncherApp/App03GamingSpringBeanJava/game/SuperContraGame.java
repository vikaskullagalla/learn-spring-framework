package com.in28minutes.learn_spring_framework.GamingLauncherApp.App03GamingSpringBeanJava.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("SuperContra - Jump");
    }
    public void down() {
        System.out.println("SuperContra - Go into a hole");
    }
    public void left() {
        System.out.println("SuperContra - Go back");
    }
    public void right() {
        System.out.println("SuperContra - Accelerate");
    }
}
