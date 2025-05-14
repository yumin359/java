package ch08.lecture.p06etc;

public class App02 {
    public static void main(String[] args) {

    }
}

interface MyInterface02 {
    void action();

    // default method : 인터페이스에 body가 있는 인스턴스 메소드(추상메소드가 아님)
    default void method() {
        System.out.println("MyInterface02.method");
    }

    // default method도 항상 public
    // 항상이라서 쓰나 안 쓰나 public 입니동
    public default void hello() {

    }
}

class MyClass021 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass021.action");
    }

    // 필요하면 default method 재정의 가능
    @Override
    public void method() {
        MyInterface02.super.method();
    }
}

class MyClass022 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass022.action");
    }
    // 써있진 않지만 default 생긴거, 재정의는 안 함
}