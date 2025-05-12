package ch07.lecture.p02override;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.action();
        a.hello();

        SubClass012 b = new SubClass012();
        b.action();
    }
}

class SuperClass01 {

    public void action() {
        System.out.println("SuperClass01.action"); // soutm
    }
}

class SubClass012 extends SuperClass01 {
    // 추가 메소드
    // 상위 클래스의 메소드를 하위 클래스에서 재정의 할 수 있다~
    @Override
    public void action() {
        System.out.println("SubClass012.action");
    }
}

class SubClass011 extends SuperClass01 {

    // 필요하다면 상속받은 메소드를 다시 정의(Override)할 수 있음
    // @Override 애노테이션 : override 메소드를 잘 작성했는지 검증
    @Override // -> 있어도 되고 없어도 됨
    public void action() {
        System.out.println("SubClass011.action");
    }

    //    @Override
    public void hello() {
        System.out.println("SubClass011.hello");
    }
}
