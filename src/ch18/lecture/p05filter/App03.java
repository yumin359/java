package ch18.lecture.p05filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App03 {
    public static void main(String[] args) throws IOException {

        buffered(); // 얘가 시간이 훨씬 빠르네영

        notBuffered();

        // 결론은 중간에 버퍼가 있어서 빠르당!

    }

    private static void notBuffered() throws IOException {
        long start = System.nanoTime();

        String file = "C:/Temp/filter03.txt";

        Writer writer = new FileWriter(file);
//        BufferedWriter br = new BufferedWriter(writer);

        try (writer) { // 이거 없어도 되는데 왜 하시는 거지
            // 이걸 쓰면 write.close()를 명시하지 않아도 자동으로 닫힘!! 그래서 쓰는 거
            // 여기선 예외가 안 발생해서 있든 없든 잘 돌아갔지만,
            // 예외가 발생하면 자원 누수가 생기고, 버퍼에 남은 데이터가 손실될 수 있기 때문에 반드시 써주래여
            for (int i = 0; i < 1_000_000; i++) {
                writer.write("this is java");
                writer.write("\n");
            }
            writer.flush();
        }

        long end = System.nanoTime();
        System.out.println("(end - start) = " + (end - start));

    }

    private static void buffered() throws IOException {
        long start = System.nanoTime();

        String file = "C:/Temp/filter03.txt";

        Writer writer = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(writer);

        try (br; writer) {
            for (int i = 0; i < 1_000_000; i++) {
                br.write("this is java");
                br.newLine();
            }
            br.flush();
        }

        long end = System.nanoTime();
        System.out.println("(end - start) = " + (end - start));
    }
}
