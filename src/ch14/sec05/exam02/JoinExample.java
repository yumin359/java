package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(); // join을 통해 스레드 종료를 기다릴 수 이따.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sumThread.getSum() = " + sumThread.getSum());
    }
}
