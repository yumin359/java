package ch18.lecture.p05filter;

import java.io.*;

public class App01 {
    public static void main(String[] args) throws IOException {
        String filename = "C:/Temp/filter01.txt";
        // reader 연습용 파일 만들기
        try (Writer writer = new FileWriter(filename)) {
            writer.write('a');
            writer.write('한');
            writer.write('글');
            writer.write("날");
            writer.write("🎈");
            writer.flush();
        }

        Reader reader = new FileReader(filename);

        // Buffered Reader : 문자들을 buffer에 넣어 놓고 한 번에 읽음
        BufferedReader br = new BufferedReader(reader);

        try (br; reader) {
            int r1 = br.read();
            System.out.println("(char) r1 = " + (char) r1); // a만 출력
            String r2 = br.readLine();
            System.out.println("r2 = " + r2); // 한글날🎈 출력
        }

    }
}
