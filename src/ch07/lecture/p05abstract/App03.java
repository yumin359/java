package ch07.lecture.p05abstract;

public class App03 {
}

abstract class Canids03 {
    public abstract void bark();
}

class Chihuahua03 extends Canids03 {
    // 추상클래스를 상속받으면
    // 추상클래스의 추상메소드는 꼭! 재정의 해야함.
    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}

abstract class Wolf03 extends Canids03 {
    // 추상메소드 재정의 안 하면 추상클래스로
    // 그러면 얘는 인스텐스로 만들 수 없게된다. 당연~
}