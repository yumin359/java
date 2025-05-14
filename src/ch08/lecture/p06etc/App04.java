package ch08.lecture.p06etc;

public class App04 {
    public static void main(String[] args) {
        MyClass041 a = new MyClass041();
//        a.common(); // 원하지 않은 일 -> private로 해결!
    }
}

interface MyInterface04 {
    default void action1() {
        System.out.println("action1 code");
        common();
    }

    default void action2() {
        System.out.println("action2 code");
        common();
    }

    // private 인스턴스 메소드
    private void common() {
        System.out.println("공통된 매우 기이잉이이이ㅣ인 코드");
    }
}

class MyClass041 implements MyInterface04 {

}

class MyClass042 implements MyInterface04 {

}