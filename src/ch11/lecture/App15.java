package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App15 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        method1();
    }

    // throws로 여러 exception 발생한다고 명시할 수 있음
    public static void method1() throws FileNotFoundException, ClassNotFoundException {
        // 하나의 코드 블럭에 여러개의 익셉션이 발생할 수 있음

        // FileNotFoundException
        FileInputStream fio = new FileInputStream("");

        // ClassNotFoundException
        Class.forName("");
    }
}
