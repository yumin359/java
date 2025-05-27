package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App03Server {
    public static void main(String[] args) throws Exception {
        // 파일 보내기
        String file = "C:\\javaweb\\client\\html\\말티즈.jpeg"; // 보낼 파일 경로
//        String file = "images/bull.jpg";

        ServerSocket serverSocket = new ServerSocket(9876);

        try (serverSocket) {
            for (int i = 0; i < 20; i++) { // 20명이 파일 받을 수 있음
                Socket socket = serverSocket.accept(); // client 연결을 기다리는 코드

                Thread t = new Thread(() -> {
                    try (socket) {// server : client 기다림

                        OutputStream os = socket.getOutputStream();
                        BufferedOutputStream bos = new BufferedOutputStream(os);
                        // os로 파일 보내기
                        FileInputStream fis = new FileInputStream(file);
                        BufferedInputStream bis = new BufferedInputStream(fis);
                        try (bis; fis; bos; os) {
                            byte[] data = new byte[1024];
                            int len = 0;

                            while ((len = bis.read(data)) != -1) {
                                bos.write(data, 0, len);
                            }
                            bos.flush();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                t.start();

                System.out.println((i + 1) + "명이 다운로드 받아감.");
            }
        }

    }
}
