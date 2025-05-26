package ch18.lecture.p05filter;

import java.io.*;

public class App04 {
    public static void main(String[] args) {
        // buffered stream 으로 속도를 향상 시킬 수 있다.

        long start = 0;
        long end = 0;
        long diff = 0;

        // Buffered OutputStream
        start = System.nanoTime();
        bufferedOutputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("bos diff = " + diff); // 0.1초

        // Buffered InputStream
        start = System.nanoTime();
        bufferedInputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("bis diff = " + diff); // 0.06초

        // OutputStream
        start = System.nanoTime();
        outputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println(" os diff = " + diff); // 0.3초

        // InputStream
        start = System.nanoTime();
        inputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println(" is diff = " + diff); // 0.2초
    }

    private static void inputStream() {
        String file = "C:/Temp/filter41.data";
        try {

            InputStream is = new FileInputStream(file);
//            BufferedInputStream bis = new BufferedInputStream(is);

            try (is) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = is.read(data)) != -1) {
                    //
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedInputStream() {
        String file = "C:/Temp/filter41.data";
        try {

            InputStream is = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(is);

            try (is; bis) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    //
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outputStream() {
        String file = "C:/Temp/filter42.data";
        try {
            OutputStream os = new FileOutputStream(file);
//            BufferedOutputStream bos = new BufferedOutputStream(os);

            byte[] data = new byte[1024];
            try (os) {
                for (int i = 0; i < 100 * 1024; i++) {
                    os.write(data);
                }
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void bufferedOutputStream() {

        String file = "C:/Temp/filter41.data";
        try {
            OutputStream os = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            byte[] data = new byte[1024];
            try (bos; os) {
                for (int i = 0; i < 100 * 1024; i++) {
                    bos.write(data);
                }
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
