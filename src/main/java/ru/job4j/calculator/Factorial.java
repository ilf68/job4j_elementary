package ru.job4j.calculator;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, fact = 1;
        System.out.println("Введите любое целое число от 1 до 12: ");
        int value = new Scanner(System.in).nextInt();
        for (i = 1; i <= value; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial " + value + " is " + fact);
    }
}