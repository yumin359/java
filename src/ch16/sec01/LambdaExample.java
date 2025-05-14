package ch16.sec01;

public class LambdaExample {
    public static void action(Calculable calculable) {
        calculable.calculate(10, 4);
    }

    public static void main(String[] args) {
        action((x, y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action(((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        }));
    }
}
