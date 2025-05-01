package ch04.lecture;

public class C19For {
    public static void main(String[] args) {
        // 2 X 1
        // 2 X 2
        // 2 X 3
        // ..
        // 2 X 9

        // 3 X 1
        // ..
        // 3 X 9

        // ..

        // 9 X 9

        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단#############");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}
