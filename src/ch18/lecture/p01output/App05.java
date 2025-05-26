package ch18.lecture.p01output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App05 {
    public static void main(String[] args) {

        String file = "C:/Temp/output5.data";

        // 예전에 작성된 코드 스타일, throws Exception 안 쓸 때
        OutputStream os = null;

        try {
            os = new FileOutputStream(file);

            os.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close(); // 꼭 해야함. // 여기선 이렇게 꼭 써줘야하지만
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // try-with-resources 사용 -> 거의 안 쓴대요? 강사님은 종종 쓰신대여
        // try의 ()내에 닫을 stream을 선언하면
        // java가 자동으로 닫아줌
        try (OutputStream os2 = new FileOutputStream(file);) {
            // 여기선 안 써줘도 됨1
            os2.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try-with-resources 사용 -> 거의 안 쓴대요? 강사님은 종종 쓰신대여
        // try의 ()내에 닫을 stream을 선언하면
        // java가 자동으로 닫아줌
        try {
            OutputStream os3 = new FileOutputStream(file);
            try (os3) {
                os3.write(3);
                // 여기선 안 써줘도 됨2
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
