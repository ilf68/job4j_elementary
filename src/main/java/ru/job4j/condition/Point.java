package ru.job4j.condition;

public class Point {public static double distance(int x1, int y1, int x2, int y2) {
    double xDist = Math.pow((x1 - x2), 2);
    double yDist = Math.pow((y1 - y2), 2);
    double result = Math.sqrt(xDist + yDist);
    return result;
}

     public static void main(String[] args) {
        double result1 = Point.distance(25, 45, 19, -48);
        double result2 = Point.distance(3, 4, 2, 20);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (3, 4) to (2, 20) " + result2);
     }
}
