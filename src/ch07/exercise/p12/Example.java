package ch07.exercise.p12;

public class Example {
    public static void action(A a) {
        a.method1();
        if (a instanceof C c) { // a가 C타입인지 확인하고(형변환에 오류가 없는지 확인하고?)
            // c 객체이면 출력하고 싶은 거
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
