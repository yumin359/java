package ch08.lecture.p06etc;

public class App05 {
    public static void main(String[] args) {
//        MyInterface05.common();// 원하지 않는 일 -> private로 해결 완료!
    }
}

interface MyInterface05 {
    static void action1() {
        System.out.println("MyInterface05.action1");
        common();
    }

    static void action2() {
        System.out.println("MyInterface05.action2");
        common();
    }

    // private static method
    private static void common() {
        System.out.println("매우 기이니니닌니닌 코드");
    }
}