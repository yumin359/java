package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1 = " + var1);
            // 최댓값 127까지 출력
            // -128 -127 -126 ...
        }

        System.out.println("--------------------");

        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--;
            System.out.println("var2 = " + var2);
            // 최솟값 -128까지 출력
            // 127 126 ...
        }
    }
}
