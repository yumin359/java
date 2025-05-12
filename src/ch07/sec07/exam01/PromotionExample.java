package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; // b is a a
        A a2 = c; // c is a a
        A a3 = d; // d is a a
        A a4 = e; // e is a a

        B b1 = d; // d is a b
        C c1 = e; // e is a c

//        B b2 = e;
//        C c2 = d;
    }
}

// @formatter:off
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}
// @formatter:on