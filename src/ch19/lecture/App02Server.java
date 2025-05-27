package ch19.lecture;

import java.io.*;
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class App02Server {
    public static void main(String[] args) throws Exception {
        String file = "images/bull.jpg";

        ServerSocket serverSocket = new ServerSocket(9876);
        Socket socket = serverSocket.accept(); // client 연결을 기다리는 코드

        try (socket; serverSocket) {// server : client 기다림
            // is로 파일 읽어서
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            // os로 파일 보내기
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            try (bis; fis; bos; os) {
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
