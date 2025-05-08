package ch06.lecture.p03method;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.action2();
        double b = a.action3();
        System.out.println("b = " + b);

        String s = a.action4();
        System.out.println("s = " + s);
        System.out.println("a.action5() = " + a.action5());

        System.out.println("next code .. ");
    }
}

class MyClass03 {
    void action1() {
        // code ..

        // return
        // 1. 메소드 종료
        // 2. 오른쪽 값 호출한 곳으로 반환
    }

    void action2() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        if (true) {
            return; // 본 메소드 종료
        }
        System.out.println(4); // 실행 안 됨.
    }

    // 리턴타입과
    // return 문의 오른쪽 값 타입이 일치해야함.
    double action3() {
        System.out.println(99);
        System.out.println(88);
        return 3.45;
//        return "hello"; // 하면 String으로 .. 리턴 타입에 맞춰야함.
    }

    String action4() {
        return "hello";
    }

    int action5() {
        return 5;
    }

    int action6() {
        // 리턴타입을 명시하면 꼭 타입에 맞는 값을 리턴해야함.
        return 7;
    }

    void action7() {
        // 리턴할 값이 없다면 void 리턴타입 사용
    }

    int action8() {
        // 리턴문을 만나도록 코드 작성해야 함.
        if (true) {
            return 10;
        } // 얘만 쓰면 false일 때 return값 없어서 오류!
        return 11;
    }

}
