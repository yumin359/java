package ch18.lecture.p04reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class App01 {
    public static void main(String[] args) throws IOException {
        // reader : 문자 단위 입력 스트림

        String fileName = "C:/Temp/writer03.txt";
        try (Reader reader = new FileReader(fileName)) {
            int r1 = reader.read();
            int r2 = reader.read();
            int r3 = reader.read();
            int r4 = reader.read();
            int r5 = reader.read();
            int r6 = reader.read();
            int r7 = reader.read();
            int r8 = reader.read();
            int r9 = reader.read();

            System.out.println("r1 = " + (char) r1);
            System.out.println("r2 = " + (char) r2);
            System.out.println("r3 = " + (char) r3);
            System.out.println("r4 = " + (char) r4);
            System.out.println("r5 = " + (char) r5);
            System.out.println("r6 = " + (char) r6);
            System.out.println("r7 = " + (char) r7);
            System.out.println("r8 = " + r8); // 얘랑
            System.out.println("r9 = " + (char) r9); // 얘랑 같아여 위에 char로 표시해서 다르게 나오는 거

        }
    }
}
