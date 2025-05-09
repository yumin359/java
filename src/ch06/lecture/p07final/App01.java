package ch06.lecture.p07final;

public class App01 {
    public static void main(String[] args) {

    }
}

class MyClass01 {
    // final 이라는게 필드는 지역변수는 파라미터든 아무튼
    // 붙으면 꼭 한번만 값을 쓸 수 있음!
    // 0번도 안 되고, 2번이상도 안 됨
    final int weight;
    final int height = 9;
    int age;

    MyClass01() {
        age = 3;
        age = 5;

        weight = 99;
    }

    MyClass01(int a) {
        weight = 88;
    }

    void method1() {
        int a;
        a = 3;
        int b = 5;

        // 값을 바꿔 넣을 수 있음.
        a = 7;
        b = 11;

        // final : 변수에 값을 한 번만 넣을 수 있음(안 넣는 것도 안 됨.)
        final int c;
        c = 9;

        // 두번 이상은 안 됨.
//        c = 11; // X
    }

    void method2(int a) {
        System.out.println(a);
        a = 9; // 값 변경 가능
    }

    void method3(final int a) {
        // 메소드 호출될 때 값 하나 들어오기 때문에
        System.out.println(a);
//        a = 9; // 얘는 두번째 값이 되므로 안 됨.
    }
}