package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}


