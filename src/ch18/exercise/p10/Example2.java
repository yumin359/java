package ch18.exercise.p10;

import java.io.*;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws IOException {

        String originFileName = null; // "C:/Temp/dir1/lion.jpg";
        String targetFileName = null; // "C:/Temp/dir2/lion.jpg";
         /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일 경로: ");
        originFileName = scanner.nextLine();
        System.out.print("복사 파일 경로: ");
          */

        InputStreamReader isr = new InputStreamReader(System.in);
        // System.in은 바이트 기반 스트림
        // 문자 기반으로 바꾸기 위해 InputStreamReader사용
        BufferedReader br = new BufferedReader(isr);
        // 성능향상을 위해 Buffered 사용

        System.out.print("원본 파일 경로: ");
        originFileName = br.readLine();
        System.out.print("복사 파일 경로: ");
        targetFileName = br.readLine();


        try (br; isr) { // scanner

            // 파일 경로를 바탕으로 File 객체 생성
            File originalFile = new File(originFileName);
            // 즉 파일 경로에 있는 lion.jpg같은 파일을 가리키는 추상 표현이 됨
            // 여기선 객체가 만들어진것이고,
            // 파일이 실제로 존재하거나 열리는 것은 아님!

            if (originalFile.exists()) { // 파일 존재 여부 확인
                int lastSlashIndex = targetFileName.lastIndexOf("/");
                File d = new File(targetFileName.substring(0, lastSlashIndex));
                if (!d.exists()) {
                    d.mkdirs();
                }

                // 파일 읽기 위한
                InputStream is = new FileInputStream(originFileName);
                // 파일 쓰기 위한
                OutputStream os = new FileOutputStream(targetFileName);

                // 성능 향상
                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (bos; bis; os; is) {
                    byte[] data = new byte[1024];
                    int len = 0;

                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }
                    bos.flush();
                }

                System.out.println("복사가 완료되었습니다.");

            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }

        }

    }
}
