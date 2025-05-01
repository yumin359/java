package ch04.practice;

public class Exercise06 {
    public static void main(String[] args) {

        System.out.println("--- 중첩 for ---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--- for ---");
        String s = "*";
        for (int i = 0; i < 5; i++, s += "*") {
            System.out.println(s);
        }

    }
}
