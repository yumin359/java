package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App01 {
    public static void main(String[] args) {
        // input stream (입력 스트림) : 프로그램으로 byte 단위로 데이터를 읽는 스트림

        String fileName = "C:/Temp/output1.data";
        try (InputStream is = new FileInputStream(fileName)) {

            // read : 1byte를 읽어서 int로 리턴(나머지 3bytes(24bits)는 0으로 채움)
            int r1 = is.read();
            int r2 = is.read();
            int r3 = is.read();
            int r4 = is.read(); // 더이상 읽을 것이 없으면 -1 리턴
            // 외울 필요 없음. hover하면 나옴 !..!

            System.out.println("r1 = " + r1); // 100
            System.out.println("r2 = " + r2); // 200
            System.out.println("r3 = " + r3); // 44
            System.out.println("r4 = " + r4); // -1

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
