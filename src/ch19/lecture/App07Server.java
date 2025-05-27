package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App07Server {
    public static void main(String[] args) throws IOException {
        // client 역할은 브라우저
        ServerSocket serverSocket = new ServerSocket(9876);
        for (int i = 0; i < 100; i++) {
            Socket socket = serverSocket.accept();

            Thread thread = new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);

                    // request message
                    // 1번 째 줄 : METHOD PATH VERSION 순으로 이루어져 있음
                    String line1 = br.readLine();
                    System.out.println("line1 = " + line1);

                    // 2번 째 줄부터 빈줄 전까지 줄 : 헤더
                    String header = "";
                    while (!(header = br.readLine()).isBlank()) {
                        System.out.println(header);
                    }

                    // 빈줄 나오고

                    // 요청 본문 시작

                    // ---------------------------------------
                    ///////// 응답 /////////
                    OutputStream os = socket.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(os);
                    PrintWriter pw = new PrintWriter(osw);

                    // 1. OutputStream이랑 InputStream이랑 계속 신경쓰면서 코드 작성하기도 바쁜데
                    // 2. HTML 코드까지 잘 작성해야하니 ,,
                    // 1은 신경 안쓰고 2만 신경써서 코드 작성할 수 있기 위해 나온 프로그램이
                    // Spring 이다~
                    String htmlCode = """
                            <!doctype htmle>
                            <html>
                                <body>
                                    <h1>처음 만나는 서버 프로그래밍 😀 </h1>
                                    <h2>여러 클라이언트에게 보내는 HTML</h2>
                                    <p>이렇게 어려운 줄 몰랐다.</p>
                                    <p>하지만 열심히 해서 꼭 취업해야지</p>
                                </body>
                            </html>
                            """;

                    // 1번 째 줄
                    // VERSION CODE STATUS
                    pw.println("HTTP/1.1 200 OK");

                    // 2번 째 줄부터 ~ 빈 줄까지
                    // 응답 헤더
                    pw.println("Content-Type: text/html; charset=UTF-8");
                    pw.println("Content-Length: " + htmlCode.getBytes().length);

                    // 빈줄
                    pw.println();

                    // 응답 본문
                    pw.println(htmlCode);
                    pw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            thread.start();
        }


    }
}
