package ch06.lecture.p01class;

public class App01 {
    public static void main(String[] args) {
        String b = new String("java");

        MyClass01 a = new MyClass01(); // 4a2a 라는 임의의 참조값을 가지게 됨
        MyClass01 c = new MyClass01(); // 6745 라는 임의의 참조값을 가지게 됨

        System.out.println(a == c); // F , 당연히 참조값이 다르니까여

        MyClass02 d = new MyClass02();

    }
}
