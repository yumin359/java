package ch06.lecture.p03method;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.go();
        MyClass02 b = new MyClass02();
        b.action(3.14); // 3.14 : argument
        b.work(9);
        int c = 10;
        b.work(c);

        // 정의된 파라미터에 맞는 순서, 타입, 갯수의 아규먼트 사용해야 함.
        b.greeting("hello", "java");
//        b.greeting("hello"); // 안됨

    }
}

class MyClass02 {
    void go() {

    }

    // 파라미터 : 메소드 호출 시 값을 받는 변수
    void action(double x) {
        System.out.println("x = " + x);
    }

    void work(int x) {
        System.out.println("x = " + x);
    }

    void greeting(String a, String b) {

    }

    void sleep(int s, int t) {

    }

    void hello(int s, double b) {

    }

    void hola(double a, int s, String c) {

    }
}