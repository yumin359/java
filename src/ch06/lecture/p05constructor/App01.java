package ch06.lecture.p05constructor;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01(); // 생성자의 이름은 클래스명과 같다
        MyClass01 b = new MyClass01();

    }
}

class MyClass01 {
    // 필드 field
    // 메소드 method

    // 생성자 constructor
    // 클래스명() {몸체}
    MyClass01() {
        // 인스턴스 만들 때 해야하는 일들
        System.out.println("새 인스턴스 만들어짐");
    }
}