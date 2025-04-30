package ch03.lecture;

public class C14Ternary {
    public static void main(String[] args) {
        // 삼항 연산자(Ternary)
        // 조건 연산자(Conditional)

        // 항1 ? 항2 : 항3\
        // 항1이 true면 항2
        // 항1이 false면 항3

        int r1 = true ? 3 : 5; // 3
        int r2 = false ? 9 : 11; // 1
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
