package com.in28minutes.learn_spring_framework.App02SpringLevel02;

public class Test {
    public static void main(String[] args) {
        String name = "Vikas";
        // Replace vowels with numbers using stream
        name.chars()
                .mapToObj(c -> (char) c)
                .map(c -> {
                    char lower = Character.toLowerCase(c);
                    return switch (lower) {
                        case 'a' -> '1';
                        case 'e' -> '2';
                        case 'i' -> '3';
                        case 'o' -> '4';
                        case 'u' -> '5';
                        default -> c;
                    };
                })
                .forEach(System.out::print);
    }
}
