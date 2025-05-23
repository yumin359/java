package ch11.lecture;

public class App10 {
    public static void main(String[] args) {

        String a = "java";
        String b = null;

        System.out.println("a.length() = " + a.length());
        if (b != null) {
            System.out.println("b.length() = " + b.length());
        }

        int c = 0;
        int d = 5;
        if (c != 0) {
            int e = d / c;
            System.out.println("e = " + e);
        }

        System.out.println("프로그램 계속 진행.");

        // Exception(checked exception)(일반 예외)
        // try-catch 꼭 해야함(다른 방법도 있는데 나중에 해주신대요)
        // compiler가 check 함


        // RuntimeException(unchecked exception)(실행 예외)
        // try-catch 꼭 안 해도 됨
        // compiler가 check 안 함

        // API 보면 Exception이 젤 상위이긴 한데 그 밑에가 RuntimeException을
        // 상속받은 애들도 있고 안 받은 애들도 나옴(엄청 많음)
        // api보면서 try-catch 코드 작성하면 됨.

    }
}
