package ch06.lecture.p02field;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();

        a.age = 3;
        a.name = "donald";

        MyClass01 b = new MyClass01();

        b.age = 5;
        b.name = "trump";

        System.out.println("a.age = " + a.age);   // 3
        System.out.println("a.name = " + a.name); // donald

        System.out.println("b.age = " + b.age);   // 5
        System.out.println("b.name = " + b.name); // trump

        MyClass01 c = b;
        System.out.println("c.age = " + c.age);   // 5
        System.out.println("c.name = " + c.name); // trump

        b.name = "musk";
        System.out.println("b.name = " + b.name); // musk
        System.out.println("c.name = " + c.name); // musk

//        b.address = "seoul";
    }
}
