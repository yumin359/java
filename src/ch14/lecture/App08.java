package ch14.lecture;

public class App08 {
    public static void main(String[] args) throws InterruptedException {
        Box08 box = new Box08();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        int value = box.getValue();
        System.out.println("value = " + value);
    }
}

class Box08 {
    private int value;
//    private Object object = new Object(); // 얘 안 쓰고

    public int getValue() {
        return value;
    }

    public void increase() {
        // synchronized block
        // : (monitor) lock을 획득한 스레드만 실행 가능
        synchronized (this) { // 이렇게 해줘도 됨.

            // 누가 가져갈지는 모르지만 어쨌든 아래 과정이 보장되기 때문에
            // 다른 일이 시작되는(덮어써지는) 일이 절대 발생되지 않음.
            value++;
            // read value
            // add value + 1
            // write value
            // 이 일을 하는 동안 다른 사람이 건들이지 못하게 하면 덮어쓰거나 하는 오류를 없앨 수 있음
        }
    }
}