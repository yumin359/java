package ch07.lecture.p04cast;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.action();
        a.work();

        SuperClass01 b = a;
        b.action(); // 재정의 해서 실행하면 SubClass011.action이 됨.
//        b.work(); // X -> 거꾸로가 안 되니까 얘는 안되져 당연히
    }
}

class SuperClass01 {
    public void action() {
        System.out.println("SuperClass01.action");
    }
}

class SubClass011 extends SuperClass01 {
    // action 메소드 있음


    @Override
    public void action() {
        System.out.println("SubClass011.action");
    }

    public void work() {
        System.out.println("SubClass011.work");
    }
}
