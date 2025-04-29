package ch02.lecture;

public class C18Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a + b; // int
        System.out.println("c = " + c);

        // 다른 타입끼리 산술연산(+, -, *, /)
        // 큰 타입이 연산 결과임
        int d = 10;
        long e = 20;
//        int f = d + e; // int 일수가 없어용
        long g = d + e; // long

        int h = 3;
        double i = 3.14;
        double j = h + i; // 산술 연산 결과는 큰 타입


        // byte, short, int 끼리의 산술연산결과는 무조건 int
        byte k = 5;
        int l = 7;
        int m = k + l; // int

        byte n = 7;
        byte o = 9;
//        byte p = n + o; // X
        int q = n + o; // int임

        int r = 5;
        int s = 3;
        int t = r / s; // 1
        System.out.println("t = " + t); // 소수점 생략

        double u = r / s; // 연산결과 자체가 1이라 double로 선언해도 1이 나온다
        System.out.println("u = " + u);

        double v = r / (double) s; // 1.66666666
        double w = (double) r / s; // 1.66666666
        System.out.println("v = " + v);
        System.out.println("w = " + w);
    }
}
