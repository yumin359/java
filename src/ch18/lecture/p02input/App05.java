package ch18.lecture.p02input;

import java.io.*;

public class App05 {
    public static void main(String[] args) throws IOException {
        // ./images/bear.jpg
        // 파일을 읽어서
        String inputFileName = "./images/bear.jpg";
        InputStream is = new FileInputStream(inputFileName);
        // C:/Temp/bear.jpg
        // 복사하기
        String outputFileName = "C:/Temp/bear.jpg";
        OutputStream os = new FileOutputStream(outputFileName);

        try (is; os;) {
            // is os가 위에 선언되어 있으니까 이름만 가져온거고,
            // 저거 한 줄을 가져온거랑 의미는 같음
            // 그리고 is os 둘 다 try 블록이 끝나면 close()를 가져오게 됨.
            byte[] bucket = new byte[1000];
            int length = 0;
            while ((length = is.read(bucket)) != -1) {
                os.write(bucket, 0, length);
            }

            os.flush();
        }

        System.out.println("파일 복사 종료");
    }
}
