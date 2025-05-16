package ch13.lecture;

public class App09 {
    public static void main(String[] args) {
        MyClass09 a = new MyClass09();
        a.<Integer>action();
        a.<String>action();

        String v1 = a.<String>action1();
        String v2 = a.action1();

        a.<Integer>action2(3);
        a.action2(3);

        a.action2("java");
    }
}

// 메소드에서도 타입 파라미터 쓸 수 있음
class MyClass09 {
    public <T> void action() { // 제네릭 메소드인 거임 얘는 지금

    }

    public <T> T action1() {
        return null;
    }

    public <T> void action2(T param) {

    }
}