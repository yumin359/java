package ch06.lecture.p06static;

public class App03 {
    public static void main(String[] args) {

    }
}

class MyClass03 {
    static String address;
    static int height;

    // static끼리도 참조 가능
    static void work() {
        // static 멤버끼리 접근 가능
        System.out.println(address + ", " + height);
        greeting();
    }

    static void staticMethod() {
        // 클래스메소드(멤버)에서 인스턴스멤버 접근 불가능
//        go(); // X
//        System.out.println(name); // X
    }
    // 클래스에서 어떤 인스턴스를 접근해야하는지 못찾음
    // 근데 어차피 인텔리제이가 오류 다 잡아준대여.

    void instanceMethod() {
        // 인스턴스 메소드(멤버)에서 클래스멤버 접근 가능
        greeting(); // ok
        System.out.println(address); // ok
    }

    static void greeting() {

    }


    int age;
    String name;

    void action() {
        System.out.println(this.name + "은" + this.age + "세다.");
        this.go();
    }

    void go() {

    }
}