package ch14.sec05.exam01;

import java.awt.*;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000); // sleep을 통해 스레드를 잠시 멈추는 방법이 있음
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
