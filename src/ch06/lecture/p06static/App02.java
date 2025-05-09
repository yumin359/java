package ch06.lecture.p06static;

public class App02 {
    public static void main(String[] args) {
        System.out.println(MyClass02.number);
        MyClass02 a = new MyClass02();
        System.out.println("a.age = " + a.age);
    }
}

class MyClass02 {
    // static field
    static int number; // = 100;

    // static block
    // 보통은 위에 처럼 그냥 바로 값 할당함.
    // 그냥 이런 게 있구나~ 로 보면 된대여
    static {
        // static field 초기화 코드 작성 가능
        int a = 3;
        if (true) {
            a *= 10;
        }
        number = a;
    }

    // instance field
    int age;

    MyClass02() {
        int a = 3;
        if (true) {
            a = a * 10;
        }
        this.age = a;
    }
}