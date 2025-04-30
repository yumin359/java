package ch03.lecture;

public class C13Assignment {
    public static void main(String[] args) {
        // 대입 연산자(할당 연산자, assignment)
        // 여긴 좀 외워줘도 좋겠대용
        int a;
        a = 3;
        System.out.println("a = " + a);
        System.out.println("(a=5) = " + (a = 5));

        int b;
        b = a = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // +=, -=, *=, /=, %=
        // 두 피연산자의 산술연산 후 왼쪽 변수에 결과 대입

        int c = 5;
        c += 7; // c = c + 7;
        System.out.println("c = " + c);

        c -= 9; // c = c - 9;
        System.out.println("c = " + c);

        c *= 8;
        System.out.println("c = " + c);

        c /= 2;
        System.out.println("c = " + c);

        c %= 5;
        System.out.println("c = " + c);

    }
}
