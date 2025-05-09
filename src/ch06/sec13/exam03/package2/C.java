package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
    public C() {
        A a = new A();

        a.field1 = 1;
//        a.field2 = 1; // 같은 패키지에서만 가능
//        a.field3 = 1; // 객체 내부에서만 가능

        a.method1();
//        a.method2();
//        a.method3();
    }
}
