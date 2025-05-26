package ch18.lecture.p04reader;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {

        String filename = "C:/Temp/reader02.txt";
        // reader 연습용 파일 만들기
        try (Writer writer = new FileWriter(filename)) {
            writer.write('a');
            writer.write('한');
            writer.write('글');
            writer.write("날");
            writer.write("🎈");
            writer.flush();
        }

        // reader 연습
        try (Reader reader = new FileReader(filename)) {
            char[] data = new char[10];
            int length = reader.read(data);

            System.out.println(data);

            System.out.println("length = " + length); // 6
        }


    }
}
