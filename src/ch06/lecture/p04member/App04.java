package ch06.lecture.p04member;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();
        a.name = "donald";

        MyClass04 b = new MyClass04();
        b.name = "trump";

        a.action("도날드");
        b.action("트럼프");
    }
}

class MyClass04 {
    String name;

    void action(String name) {
        // 파라미터도 지역변수처럼 쓰면 됨.
        // 그래서 얘도 필드를 가림.
        // 그래서 필드를 쓰고 싶으면 this를 써야함.
//        this.name = name;
        // 위에 주석 풀면 결과는
        // 도날드, 도날드, 트럼프, 트럼프
        System.out.println("name = " + name);
        System.out.println("this.name = " + this.name);
    }
}