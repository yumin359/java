package ch06.sec14;

public class Car {

    // 결론은
    // 필드는 private
    // 메소드는 public
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    // boolean type getter는 is로 시작
    // getter로 해도 괜찮긴 하대여
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) this.speed = 0;
    }
}
