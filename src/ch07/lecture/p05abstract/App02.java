package ch07.lecture.p05abstract;

public class App02 {
    public static void main(String[] args) {
        Canids02 a = new Chihuahua02();
        a.bark(); // 깨갱

        Canids02 b = new Wolf02();
        b.bark(); // 아우~~~~~
    }
}

// 추상메소드가 있으면 반드시 추상클래스이어야함.
// 추상클래스라고 추상메소드가 꼭 있어야하는건아님.
abstract class Canids02 {
    // abstract method(추상메소드) : 몸통(body) 메소드가 없는, 코드 블럭 {} 이 없음
    public abstract void bark();
}

class Chihuahua02 extends Canids02 {
    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}

class Wolf02 extends Canids02 {
    @Override
    public void bark() {
        System.out.println("아우~~~~~");
    }
}