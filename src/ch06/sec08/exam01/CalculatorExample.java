package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator Cal = new Calculator();

        Cal.powerOn();

        int result1 = Cal.plus(5, 6);
        System.out.println("result1 = " + result1);

        int x = 10;
        int y = 4;
        double result2 = Cal.divide(x, y);
        System.out.println("result2 = " + result2);

        Cal.powerOff();

    }
}
