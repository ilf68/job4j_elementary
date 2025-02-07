package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rezult = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                rezult += anInt;
            }
        }
        return rezult;
    }
}
