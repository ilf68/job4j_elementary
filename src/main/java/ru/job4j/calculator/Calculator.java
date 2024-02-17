package ru.job4j.calculator;

import java.util.Scanner;

public class Calculator {

    private static int x = 10;

    public int multiply(int a) {
        return x * a;
    }
    public int divide(int a) {
        return a / x ;
    }
    public int sum(int a) {
        return x + a;
    }
    public static int minus(int a) {
        return a - x;
    }
    public int sumAllOperation(int a) {
        return divide(a) + minus(a) + sum(a) + multiply(a);

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Введите любое целое число: ");
        int a = new Scanner(System.in).nextInt();
        int sum1 = calculator.sum(a);
        int divide1 = calculator.divide(a);
        int multiply1 = calculator.multiply(a);
        int minus1 = calculator.minus(a);
        int result = calculator.sumAllOperation(a);
        System.out.println("Сумма х и " + a + " = " + sum1);
        System.out.println(a + " делить на "+ x + " = " + divide1);
        System.out.println(a + " умножить на "+ x + " = " + multiply1);
        System.out.println(a + " минус " + x + " = " + minus1);
        System.out.println("Сумма всех опреаций над " +  a + " при х " + x + " = " + result);



    }
}

