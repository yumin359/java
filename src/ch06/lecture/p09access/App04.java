package ch06.lecture.p09access;

import ch06.lecture.p09access.sub1.MyClass04;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();
//        a.age = 33; // X
        a.email = "yahoo";
//        a.home = "jeju"; // X, 다른 패키지라 안 됨
    }
}
