package ru.job4j.converter;

public class Converter {
    /*int dollarCourse = 60;
    int euroCourse = 70;
    float rubleCount = 140;*/
    public static float rubleToEuro(float value) {
        float rezult = value / 70;
        return rezult;
    }

    public static float rubleToDollar(float value) {
        float rezult1 = value / 60;
        return rezult1;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float inputD = 180;
        float expectedD = 3;
        float outputD = Converter.rubleToDollar(inputD);
        boolean passedD = expectedD == outputD;
        System.out.println("180 rubles are 3 dollars. Test result : " + passedD);
    }
}
