package ch09.sec04.exam01;

public class A {

    A() {
        class B {
        }
        // 여기서 선언된 B 클래스랑
        B b = new B();
    }

    void method() {
        class B {
        }
        // 여기서 선언된 B 클래스는 서로 다른 클래스임
        B b = new B();
    }
}
