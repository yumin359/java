package ch14.lecture;

import java.awt.*;

public class App02 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            
            for (int i = 0; i < 5; i++) {
                toolkit.beep(); // 소리내고
                try {
                    Thread.sleep(1000); // 1초 쉬고
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 그래서 총 다섯번 소리남
            }
        });

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띠리링");
            Thread.sleep(1000);
        }
        // 같이 동작하고 싶은 것 만큼 스레드도 만들면 됨!
    }
}
