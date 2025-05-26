package ch18.lecture.p03writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("C:/Temp/writer01.txt")) {
            os.write(97);   // a
            os.write(100);  // d
            os.write(103);  // g
            os.write(33);   // !

            os.write('t');  // 문제 없음 -> t
            os.write('걸'); // AC78(유니코드) 중에 78(유니코드)만 써져서 -> x
            // 그래서 AC랑 78이랑 각각 써줘야함.

            os.flush();
        }


    }
}
