package ch19.lecture;

import java.io.*;
import java.net.Socket;

public class App05Client {
    public static void main(String[] args) throws Exception {
        // server에게 file 보내기
        // 192.168.0.5 : 9876
        String file = "C:\\Users\\admin\\Downloads\\잔망루피.jpg";
        Socket socket = new Socket("192.168.0.38", 9876);

        try (socket) {
            // 파일을 먼저 읽어야 함. (Input)
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);

            // 읽은 파일을 소켓으로 보내야 함. (Output)
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (fis; bis; os; bos) {
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
