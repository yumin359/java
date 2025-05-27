package ch19.lecture;

import java.io.*;
import java.net.Socket;

public class App03Client {
    public static void main(String[] args) throws Exception {
        // 파일 받아오기
        String file = "C:/Temp/download.jpg"; // 받아올 파일 경로

        // client : server에 연결
        Socket socket = new Socket("192.168.0.5", 9876);

        try (socket) {
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            // is로 파일 받기
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (bos; fos; bis; is) {
                byte[] data = new byte[1024];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }

    }
}
