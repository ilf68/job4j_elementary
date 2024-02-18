package ru.job4j.condition;

public class Max {
    public static int max(int m, int n) {
        return m >= n ? m : n;
    }

    public static int max(int m, int n, int o) {
        return max(max(m, n), o);
    }

    public static int max(int m, int n, int o, int p) {
        return max(max(m, n), max(o, p));
    }
    public static void main(String[] args) {
        int rez1 = max(5, 7);
        int rez2 = max(5,12,45);
        int rez3 = max(5,12,45, 68);
        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);
    }

}
