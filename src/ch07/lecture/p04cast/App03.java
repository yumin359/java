package ch07.lecture.p04cast;

public class App03 {
    public static void main(String[] args) {
        SuperClass03 a = new SubClass031(); // 여기서는 자동형변환이 일어남
        a.action();
//        a.hello(); // X

        // 거꾸로 하고 싶을 때는 강제로 해주는
        // 강제형변환(위험)
        SubClass031 b = (SubClass031) a;
        b.action();
        b.hello();
    }
}

class SuperClass03 {
    public void action() {
        System.out.println("SuperClass03.action");
    }
}

class SubClass031 extends SuperClass03 {
    @Override
    public void action() {
        System.out.println("SubClass031.action");
    }

    public void hello() {
        System.out.println("SubClass031.hello");
    }
}