package ch04.practice;

public class Exercise04 {
    public static void main(String[] args) {

        int a, b;

        do {
            a = (int) (Math.random() * 6) + 1;
            b = (int) (Math.random() * 6) + 1;
            System.out.println("(" + a + ", " + b + ")");
        } while (a + b != 5);

        System.out.println("끝");
    }
}
