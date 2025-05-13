package ch08.lecture.p02method;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.action1();
        a.action2();

        MyInterface031 b = a;
        MyInterface032 c = a;

        b.action1();
//        b.action2(); // X

//        c.action1(); // X
        c.action2();
    }
}

interface MyInterface031 {
    void action1();
}

interface MyInterface032 {
    void action2();
}

class MyClass03 implements MyInterface031, MyInterface032 {
    @Override
    public void action1() {

    }

    @Override
    public void action2() {

    }
}
