package ch16.lecture.p01lambda;

public class App09 {
    public static void main(String[] args) {
        MyInterface09 o = (a, b, c) -> a.action(b, c);
        // a 클래스의 메소드에 변수에 b,c가 들어감
        // 첫번째 파라미터의 타입명::첫번째 파라미터의 메소드명
        MyInterface09 s = MyClass09::action;
    }
}

class MyClass09 {
    void action(int a, int b) {
        System.out.println("MyClass09.action");
    }
}

@FunctionalInterface
interface MyInterface09 {
    void some(MyClass09 a, int b, int c);
}