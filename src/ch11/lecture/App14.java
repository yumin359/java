package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App14 {
    public static void main(String[] args) throws FileNotFoundException {
        // 얘까지 throws 하면 프로그래밍이 자동 종료됨
        // 그래서 마지막엔 try-catch로 해주는게 좋음
        // 종료시킬 목적이라면 안 써도 됨
        method4();

        System.out.println("프로그램 종료"); // throws 로 하면 실행 안 됨.
    }

    public static void method4() throws FileNotFoundException {
        method3();
    }

    public static void method3() throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        FileInputStream fio = new FileInputStream("");
    }
}
