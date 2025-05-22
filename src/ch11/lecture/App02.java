package ch11.lecture;

public class App02 {
    public static void main(String[] args) {
        // try : exception이 날 수 있는 코드
        // catch : exception이 나면 실행될 코드

        try {
            int a = 0;
            int b = 5;
            int c = b / a; // ArithmeticException
            // exception 발생시 catch 블럭으로 흐름이 넘어감

            // try안에는 관련된 다른 코드들 넣어도됨.

            System.out.println("프로그램 진행");
        } catch (ArithmeticException e) {
            System.out.println("예외 발생시 실행되는 코드");
        }

        System.out.println("나머지 코드들 ... ");

    }
}
