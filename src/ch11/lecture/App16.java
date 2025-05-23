package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App16 {
    public static void main(String[] args) {
        // 얘더 같이 Exception으로 써줘야 함
        // throws 로 해줘도 됨. 밑에서 선언해준 이름(Exception)으로 해주면 됨.
        // 상위 타입으로 해줘도 됨.
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        // 다형성에 의해 상위 익셉션으로 사용 가능

        FileInputStream fio = new FileInputStream("");
        Class.forName("");
    }
}
