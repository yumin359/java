package ch14.sec05.exam02;

public class SumThread extends Thread {
    // 스레드를 상속해서 만들 수 있다. -> 근데 거의 일어나지 않음
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
    }
}
