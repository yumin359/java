package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        ch06.sec08.exam04.Calculator c = new Calculator();

        double result1 = c.areaRectangle(10);

        double result2 = c.areaRectangle(10, 20);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
