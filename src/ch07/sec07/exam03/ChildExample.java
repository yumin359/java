package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
//        Parent parent = new Parent();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2"; // X
//        parent.method3(); // X

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
