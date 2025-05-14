package ch09.sec03.exam01;

public class A {
    static class B {
    }
    // B라는 클래스를 여기저기에 썼다~ -> 중첩 클래스 ^^

    B field1 = new B();

    static B field2 = new B();

    A() {
        B b = new B();
    }

    void method1() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }
}
