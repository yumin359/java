package ch14.sec04.exam02_ch15;

import java.util.Map;

public class ConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new java.util.concurrent.ConcurrentHashMap<>();
//        Map<String, Integer> map = new HashMap<>(); // 이렇게 하면 2000개 안 나옴

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();

        int size = map.size();
        System.out.println("size = " + size);
        System.out.println();

    }
}
