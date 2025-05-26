package ch18.lecture.p02input;

import java.io.*;
import java.util.Arrays;

public class App04 {
    public static void main(String[] args) throws IOException {
        // inputstream에서 사용할 파일을 먼저 만들기
        String file = "C:/Temp/input03.data";
        try (OutputStream os = new FileOutputStream(file)) {
            for (int i = 0; i < 35; i++) {
                os.write(i);
            }
        }
        System.out.println("파일 만들기 종료");

        byte[] data = new byte[10];

        try (InputStream is = new FileInputStream(file)) {
            int length = 0;
            while ((length = is.read(data)) != -1) {
                byte[] copy = Arrays.copyOf(data, length);
//                System.out.println("length = " + length);
                System.out.println("data = " + Arrays.toString(copy));
            }
        }


    }
}
