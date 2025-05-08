package ch06.lecture.p05constructor;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        MyClass02 b = new MyClass02();
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
    }
}

class MyClass02 {
    // field
    String name;
    // method

    // constructor
    MyClass02() {
        // 객체 생성시 해야하는 일들
        // 주로 필드 값을 초기화하는 일을 함
        this.name = "trump"; // 지금은 가리고 있는게 없으니까 this 생략가능
    }
}