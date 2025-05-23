package ch14.sec02.exam02_ch15;

import ch15.sec02.exam01.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("title" + i, "content" + i, "writer" + i));
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("title" + i, "content" + i, "writer" + i));
                }
            }
        };

        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();

        int size = list.size();
        System.out.println("size = " + size);
        System.out.println();

    }
}
