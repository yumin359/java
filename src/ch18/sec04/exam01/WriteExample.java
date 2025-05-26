package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {

        try {
            try (Writer writer = new FileWriter("C:/Temp/test.txt")) {
                char a = 'A';
                writer.write(a);
                char b = 'B';
                writer.write(b);
                
                char[] arr = {'C', 'D', 'E'};
                writer.write(arr);

                writer.write("FGH");

                writer.flush(); // 버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
//                writer.close(); // 없어도 됨.
                // 혹은 try 한번하고 throws 로도 가능
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
