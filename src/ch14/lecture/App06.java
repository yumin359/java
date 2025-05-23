package ch14.lecture;

public class App06 {
    public static void main(String[] args) throws InterruptedException {
        // Thread 사용 시 주의해야 하는 점
        // : 여러 스레드는 공유하는 객체의 상태를 변경할 때 조심해야 함.
        // 덮어쓰고, 덮어써질 수도 있어서 생각한대로 값이 안 나올 수 있음.
        // -> 해결 방법은 많음. 그냥 해결 방법이 있다 라고 알면 됨. 회사마다 해결 방법이 다름

        Box06 box = new Box06();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();

        int value = box.getValue();
        System.out.println("value = " + value);

    }
}

class Box06 {
    private int value;

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }
}