package ch11.sec02.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        System.out.println("처음 코드");
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("나머지 코드");
        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // 이게 나중에 출력되는거 그렇게 크게 신경 안 써도 된대여
        }
        System.out.println("또 나머지 코드");

        // 오류가 발생하면
        // try->catch->그다음
        // 오류 발생 안 하면
        // try->그다음 : 애초에 catch로 안 넘어감
        // 흐름을 잘 알아야한대용
    }
}
