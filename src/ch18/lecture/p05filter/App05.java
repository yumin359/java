package ch18.lecture.p05filter;

import java.io.*;

public class App05 {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/filter05.txt";

        // OutputStream을 Writer로 감싸는 보조스트림(filter stream)
        // OutputStreamWriter

        try (OutputStream os = getOutputStream(file);
             Writer osw = new OutputStreamWriter(os)) {
//             OutputStreamWriter osw = new OutputStreamWriter(os)) {
            // 둘 다 상관 없음

            osw.write('a');
            osw.write('b');
            osw.write('x');
            osw.write('y');

            osw.write('한'); // 원래 안 되는데 Writer로 감싸서 됨.
            osw.flush();
        }
    }

    private static OutputStream getOutputStream(String file) throws IOException {
        return new FileOutputStream(file);
    }
}
