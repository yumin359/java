package ch11.lecture;

public class App17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (RuntimeException e) {
            System.out.println("예외 발생");
        }
        System.out.println("프로그램 실행 이어감");

    }

    public static void method1() { // throws RuntimeException { // 해도 되고 안 해도 됨
        // 내가 작성하는 코드
        // exception 발생(던짐)

        throw new RuntimeException();


    }
}
