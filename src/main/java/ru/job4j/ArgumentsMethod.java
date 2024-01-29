package ru.job4j;

public class ArgumentsMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        for (int i = 1; i <= 4; i = i + 1) {
            ArgumentsMethod.hello(name, age);
        }

    }
}