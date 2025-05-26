package ch18.exercise.p10;

import ch11.exercise.p07.NotExistIDException;

import java.io.*;
import java.nio.file.DirectoryNotEmptyException;

public class Example {
    public static void main(String[] args) throws Exception {
        String origin = "images/eagle.jpg";
        String target = "C:/Temp/eagle.jpg";

        // 파일 복사 코드 작성
        // BufferedInputStream, BufferedOutputStream 활용

        // 선생님 코드
        // 기존 방식, 똑같은 파일 크기가 복사되었고, 걸린 시간은 300_0000
        // 버퍼 쓰면 , 시간이 줄어들긴 함. 근데 이건 파일크기가 작아서 별 차이 없긴 해여
        long start = System.nanoTime();
        try {
            InputStream is = new FileInputStream(origin);
            BufferedInputStream bis = new BufferedInputStream(is);

            OutputStream os = new FileOutputStream(target);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (is; os; bis; bos) {
                byte[] data = new byte[1000];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        long diff = end - start;
        System.out.println("diff = " + diff); // 300_0000



        /*
        try {
            InputStream is = new FileInputStream(origin);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(target);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (is; bis) {
                byte[] data = new byte[1024];
                while (true) {
                    int num = bis.read(data);
                    if (num == -1) break;
                    bos.write(data, 0, num);
                }
            }
            System.out.println("원본 파일 경로: " + origin);
            System.out.println("복사 파일 경로: " + origin);
            System.out.println("복사가 성공되었습니다");

        } catch (FileNotFoundException e) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        } catch (DirectoryNotEmptyException e) {
            System.out.println("여긴 모냐");
        }

         */


    }
}
