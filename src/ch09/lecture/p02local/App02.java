package ch09.lecture.p02local;

public class App02 {
    void some() {
        // local variable
        // effectively final : 사실상 파이널..
        int a = 5;

        class MyClass {
            void action() {
                // 감싸고 있는 메소드(some)의
                // 지역변수(a)를 사용한다면
                // 그 지역변수(a)는 값이 변경되면 안 됨

                System.out.println(a);
            }
        }
//        a = 6; // 값 변경 안 됨
        // 근데 거의 인텔리제이에서 오류면 오류라고 잡아준대영..
    }
}
