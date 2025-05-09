package ch06.lecture.p09access.sub1;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();
//        a.age = 3; // X
        a.email = "gamil";
        a.home = "seoul"; // 패키지 위치가 같아서 됨.
    }
}
