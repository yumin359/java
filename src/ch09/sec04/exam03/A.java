package ch09.sec04.exam03;

public class A {
    public void method1(int arg) {
        int var = 1;

        class B {
            void method2() {
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

//                arg = 2;
//                var = 2;
            }
        }

        B b = new B();
        b.method2();

//        arg = 3; // 변경하려고 하면 오류떠요 자동으로
//        var = 3;
    }
}
