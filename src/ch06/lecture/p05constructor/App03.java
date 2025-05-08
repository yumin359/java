package ch06.lecture.p05constructor;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03("머스크", 66, "texas");
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.address);

        MyClass03 b = new MyClass03("도널드", 77, "ny");
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.address);
    }
}

class MyClass03 {
    // field
    String name; // = "aaa";
    int age;
    String address;

    // 생성자
    MyClass03(String name, int age, String address) {
        //this.name = name;
        this.age = age;
        this.address = address;
    }

    // method
}