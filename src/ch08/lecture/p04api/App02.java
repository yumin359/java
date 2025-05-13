package ch08.lecture.p04api;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        // Object
        Object o = s;
        // Closeable
        Closeable c = s;
        // AutoCloseable
        AutoCloseable a = s;
        // Iterator
        Iterator i = s;

        // instanceof
        System.out.println(c instanceof Scanner);
        System.out.println(c instanceof Object);
        System.out.println(c instanceof Closeable);
        System.out.println(c instanceof AutoCloseable);
        System.out.println(c instanceof Iterator);

        c.close();
//        c.nextLine();
        Scanner c1 = (Scanner) c;
        c1.nextLine();

    }
}