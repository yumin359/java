package ch02.lecture;

public class C01Variable {
    public static void main(String[] args) {
        // 변수 : 값을 담는 이름있는 공간

        // 변수선언
        // 타입 변수명;
        int a;
        double b;
        String c;

        // 변수에 값 할당(대입, assgin, assignment)
        a = 9;
        b = 3.14;
        c = "hello";

        // 변수 선언과 값 할당을 한 명령문에
        // 타입 변수명 = 값
        int d = 7;
        double e = 9.12;
        String f = "java";

        // 여러 변수를 한 명령문에서 선언
        int g, h;
        double i, j, k;
        String l, m, n, o;
        g = 8;
        h = 7;
        i = 9.88;
        n = "hi";

        // 여러 변수선언과 값 할당을 한 명령문에서 작성
        int p = 3, q = 4;
        double r = 3.14, s = 9.12;

        // 변수에 값을 넣지 않고 사용할 수 없음.
        int t = 3; // 값있음
        int u; // 값없음
        int v;
        u = 4;
        System.out.println(t); // ok
        System.out.println(u); // ok
//        System.out.println(v); // not ok

    }
}
