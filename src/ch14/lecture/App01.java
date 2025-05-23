package ch14.lecture;

public class App01 {
    public static void main(String[] args) {
        // Thread 객체를 만들어서 실행

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("내가 만든 Thread의 실행 코드");
            }
        });

        thread.start();
        // 약간 가사를 보면서 노래를 들을 수 있는 느낌이래여
        // 두 개가 번갈아 가면서 출력되고 있움

        for (int i = 0; i < 10000; i++) {
            System.out.println("@메인 Thread의 실행 코드");
        }


    }
}
