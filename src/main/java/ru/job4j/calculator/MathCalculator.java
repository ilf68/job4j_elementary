package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divideAndDiff(double first, double second) {
        return divide(first, second)
                + difference(first, second);
    }

    public static double sumAll(double first, double second) {
        return divide(first, second) + difference(first, second) + sum(first, second) + +multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат 2-го расчета равен: " + divideAndDiff(20, 10));
        System.out.println("Результат 2-го расчета равен: " + sumAll(20, 10));
    }

}
