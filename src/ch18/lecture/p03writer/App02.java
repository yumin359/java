package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App02 {
    public static void main(String[] args) throws IOException {
        // byte 단위
        // inputStream, outputStream 으로
        // 문자(ascii 코드 외)를 읽고 쓰는게 너~~무 불편하다.

        // 문자(character) 단위 -> 바이트 수는 중요하지 않아여~
        // reader, writer 가 추가됨

        // writer : 문자 단위 출력 스트림

        String fileName = "C:/Temp/writer02.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a'); // 0061 이라서 8bits로 읽을 수 있음
            // 0061(Hex, 16진수) -> [ 0000_0000_0110_0001(2진수) : 안 거쳐도 나오넹 ㅎ] -> 97(10진수)
            writer.write(97);
            writer.write('걸');
            writer.write(44152); // AC78(Hex, 16진수) -> 44152 (10진수)
//
//            writer.write("FGH");
//            writer.write('\u2669');
//            writer.write("🧢");
//            writer.write("\uD83C\uDF88"); // 🎈


            writer.flush();
        }
        System.out.println("파일 쓰기 완료");
    }
}
