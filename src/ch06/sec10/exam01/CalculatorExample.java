package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        double r1 = 10 * 10 * Calculator.pi;
        int r2 = Calculator.plus(10, 5);
        int r3 = Calculator.minus(10, 5);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
    }
}
