package ch16.sec05.exam01;

public class Computer {
    public static double staticMethod(double x, double y) {
        return x + y;
    }

    public double instanceMethod(double x, double y) {
        // multiply 같이 의미있는 이름을 하면 메인문에서 볼 때 이해가 쉽겠져
        return x * y;
    }
}
