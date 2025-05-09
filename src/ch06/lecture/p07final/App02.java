package ch06.lecture.p07final;

public class App02 {
    public static void main(String[] args) {
        // static final field 예
        // integer 최대값, 최소값
        System.out.println(Integer.MAX_VALUE); // 얘네들 대문자로만 있으니
        System.out.println(Integer.MIN_VALUE); // static final field인 것을
        System.out.println(Long.MAX_VALUE); // 알 수 있당.
        System.out.println(Long.MIN_VALUE);
    }
}

class MyClass02 {

    // static field에 final 적용 : 값을 한 번만 대입 가능
    // static field 명은 대문자로 작성
    // _ 를 통해 단어를 구분
    // UPPER_SNAKE_CASE
    // final static
    // static final
    // 둘 순서 상관 없음
    // 변하지 않는 값은
    // static final로 쓰는구나 ~
    final static int HEIGHT = 99;
    final static int WEIGHT;
    final static String COMPANY_NAME = "apple";

    static {
        WEIGHT = 100;
//        HEIGHT = 101; // X
    }

    final int age;

    public MyClass02(int age) {
        this.age = age;
    }
}