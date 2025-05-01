package ch04.lecture;

public class C23Break {
    public static void main(String[] args) {
        // break : 가장 가까운 반복문(for, while, switch(반복문은 X)) 종료

        // label과 함께 사용하면 label이 붙은 반복문(for, while) 종료

        // label
        loop1:
        for (int i = 1; i < 11; i++) {
            // label
            // loop2:
            for (int j = 1; j < 11; j++) {
                if ((4 * i) + (5 * j) == 60) {
                    System.out.println(i + ", " + j);
                    break loop1;
                }
            }
        }
    }
}
