package ch05.lecture;

public class C26StringMethod {
    public static void main(String[] args) {
        // indexOf : 특정 문자열이 처음 발견된 위치를 리턴 
        String a = "hello java hello spring hello react";
        int b = a.indexOf("java");
        System.out.println("b = " + b); // 6

        int c = a.indexOf("hello"); // 처음 발견한 위치
        System.out.println("c = " + c);

        int d = a.indexOf("jsp"); // 발견하지 못했을 때 -1 리턴
        System.out.println("d = " + d);

        // contains : 특정 문자열이 있는 지 확인
        boolean e = a.contains("java");
        System.out.println("e = " + e); // T
        boolean f = a.contains("ring");
        System.out.println("f = " + f); // T
        boolean g = a.contains("jsp");
        System.out.println("g = " + g); // F

        // startsWith : 특정 문자열로 시작하는지
        boolean h = a.startsWith("hello");
        System.out.println("h = " + h); // T
        boolean i = a.startsWith("hell");
        System.out.println("i = " + i); // T
        boolean j = a.startsWith("heaven");
        System.out.println("j = " + j); // F

        // endsWith : 특정 문자열로 끝나는지
        boolean k = a.endsWith("react");
        System.out.println("k = " + k); // T
        boolean l = a.endsWith("act");
        System.out.println("l = " + l); // T
        boolean m = a.endsWith("stop");
        System.out.println("m = " + m); // F

        // lastIndexOf : 특정 문자열이 마지막에 나타나는 위치 리턴
        int n = a.lastIndexOf("hello");
        System.out.println("n = " + n); // 24
        int o = a.lastIndexOf("jsp");
        System.out.println("o = " + o); // -1

        String str = "hello";
        int idx = str.indexOf('l'); // 결과: 2
        System.out.println("idx = " + idx);

    }
}
