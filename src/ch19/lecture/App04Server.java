package ch19.lecture;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class App04Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(9876)) {

            for (int i = 0; i < 100; i++) { // while true로 하면 계속
                Socket socket = serverSocket.accept();
                String client = socket.getRemoteSocketAddress().toString(); // client 주소를 알 수 있음

                try (socket) {
                    Thread thread = new Thread(() -> {
                        try (
                                InputStream is = socket.getInputStream();
                                InputStreamReader isr = new InputStreamReader(is);
                                BufferedReader br = new BufferedReader(isr)) {
                            // OutputStream : System.out 쓰겠다. 콘솔창에 보여줄거라서용

                            String message = null;
                            while ((message = br.readLine()) != null) {
                                System.out.println("[" + client + "]: " + message);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                socket.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
