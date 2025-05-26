package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App03 {
    public static void main(String[] args) throws IOException {

        try (Writer writer = new FileWriter("C:/Temp/writer03.txt")) {
            writer.write('a');
            writer.write('한');
            writer.write('\u2669');
//            writer.write('\u1f9e2'); // 안 됨
            writer.write("🧢");
            writer.write("\uD83C\uDF88"); // 🎈

            writer.flush();
        }


    }
}

