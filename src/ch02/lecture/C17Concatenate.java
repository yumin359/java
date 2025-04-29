package ch02.lecture;

public class C17Concatenate {
    public static void main(String[] args) {
        // + : 문자열 연결 연산
        String a = "java";
        String b = "hello";

        String c = a + b; // a와 b를 연결
        System.out.println("c = " + c);
        System.out.println("(a+b) = " + (a + b));

        String d = "react";
        String e = a + b + d;
        System.out.println("e = " + e);
        String f = (a + b) + d;
        System.out.println("f = " + f);
        String g = a + (b + d);
        System.out.println("g = " + g);

        // 다른 타입과 문자열을 + 연산하면 연결연산

        String h = "java";
        int i = 300;
        String j = h + i; // 더한 결과는 String
        System.out.println("j = " + j);

        String k = "500";
        int l = 400;
        String m = k + l; // 더한 결과 String
        System.out.println("m = " + m);

        int n = 200;
        int o = 300;
        String p = "400";

        // n + o + p -> 순서대로 더함
        String q = n + o + p; // 500400
        System.out.println("q = " + q);

        String r = (n + o) + p; // 500400
        System.out.println("r = " + r);

        String s = n + (o + p); // 200300400
        System.out.println("s = " + s);
    }
}
