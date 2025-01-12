package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        // Assuming the conversion rate is 1 Euro = 70 Rubles
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        // Assuming the conversion rate is 1 Dollar = 60 Rubles
        return value / 60;
    }
    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        double output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float inputD = 180;
        float expectedD = 3;
        double outputD = Converter.rubleToDollar(inputD);
        boolean passedD = expectedD == outputD;
        System.out.println("180 rubles are 3 dollars. Test result : " + passedD);
        float input2 = 200;
        double output2 = Converter.rubleToEuro(input2);
        System.out.println(output2);
    }
}
