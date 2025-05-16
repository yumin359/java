package ch12.lecture.p05wrapper;

public class App03 {
    public static void main(String[] args) {
        int a = 3;
        Integer b = a; // boxing

        Object c = b; // ok

        Object d = 3; // auto boxing과 자동형변환이 한 번에 일어남

        int e = b; // unboxing

//        int f = d; // unboxing과 강제형변환은 같이 일어나지 않음.

    }
}
