package ch14.lecture;

public class App05 {
    public static void main(String[] args) {
        // Runnable Interface 구현
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("runnable 객체");
            }
        });

        Thread myThread = new MyThread5();

        // 두 개가 번갈아 가며 나온당~
        myThread.start();
        thread.start();

    }
}

// Thread 클래스 상속  으로 thread 만들기
class MyThread5 extends Thread {

    // run() 메소드 재정의 해야힘
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("[[Thread 상속해서 만든 코드]]");
        }
    }
}