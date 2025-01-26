package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Печатаем числа в прямом порядке
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Печатаем числа в обратном порядке
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Переход на новую строку
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 4:");
        draw(4);
        System.out.println("Number pyramid of height 7:");
        draw(7);
    }
}
