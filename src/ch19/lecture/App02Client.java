package ch19.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class App02Client {
    public static void main(String[] args) throws Exception {
        String file = "C:/Temp/download.jpg";

        // client : server에 연결
        Socket socket = new Socket("192.168.0.38", 9876);

        try (socket) {
            // is로 파일 읽어서
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            // os로 파일을 받기?->해당 파일 경로로 파일을 받는거져
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
