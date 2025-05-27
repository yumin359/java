package ch18.lecture.p05filter;

import java.io.*;
import java.util.List;

//
public class App09 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ObjectInputStream, ObjectOutputStream
        // 객체 입출력을 위한 filter stream

        String file = "C:/Temp/filter09.data";
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        try (os; oos) {
            // 직렬화, serialization
            oos.writeObject(List.of("java", "react", "spring"));
            oos.flush();
        }

        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);

        try (is; ois) {
            // 역직렬화, deserialization
            Object o = ois.readObject();
            System.out.println("o = " + o);
            System.out.println(o instanceof List);
        }
    }
}
