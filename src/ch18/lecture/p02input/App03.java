package ch18.lecture.p02input;

import java.io.*;
import java.util.Arrays;

public class App03 {
    public static void main(String[] args) throws IOException {

        // inputstream에서 사용할 파일을 먼저 만들기
        String file = "C:/Temp/input03.data";
        try (OutputStream os = new FileOutputStream(file)) {
            for (int i = 0; i < 35; i++) {
                os.write(i);
            }
        }
        System.out.println("파일 만들기 종료");

        // inputstream으로 읽기
        // 파일크기 : 35bytes
        byte[] datas;
        try (InputStream is = new FileInputStream(file)) {

            // read : 몇 byte 읽었는지 return
            datas = new byte[10];
            int r1 = is.read(datas);
            System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
            // 0 1 2 3 4 5 6 7 8 9
            int r2 = is.read(datas);
            System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
            // 10 11 12 13 14 15 16 17 18 19
            int r3 = is.read(datas);
            System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
            // 20 21 22 23 24 25 26 27 28 29
            int r4 = is.read(datas);
            System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
            // 30 31 32 33 34 그리고!! 25 26 27 28 29
            // 같은 값으로 참조하기 때문에 전의 값이 남아있는 것임
            int r5 = is.read(datas);
            System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
            // 더이상 읽을 값이 없어서 전 값이랑 같음

            System.out.println("r1 = " + r1); // 10
            System.out.println("r2 = " + r2); // 10
            System.out.println("r3 = " + r3); // 10
            System.out.println("r4 = " + r4); // 5
            System.out.println("r5 = " + r5); // -1

        }

    }
}
