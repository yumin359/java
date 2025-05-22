package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        System.out.println("프로그램시작");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("프로그램종료"); // 이 코드는 실행되지 못함.
    }
}
