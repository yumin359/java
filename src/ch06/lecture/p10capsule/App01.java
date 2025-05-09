package ch06.lecture.p10capsule;

public class App01 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.speed = 100;
        car1.speed = 0;
        car1.speed = -300;

        Car2 car2 = new Car2();
//        car2.speed = 300;
        car2.setSpeed(100);
        car2.setSpeed(50);
        car2.setSpeed(300); // 동작 X
        car2.setSpeed(-300);// 동작 X
        int s = car2.getSpeed();
        System.out.println("s = " + s);

    }
}

class Car1 {
    int speed;
}

class Car2 {
    // field는 private으로
    private int speed;

    // setter : field 값을 변경하는 메소드를 public으로
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 100) {
            this.speed = speed;
        }
    }

    // getter : field 값을 읽는(얻는) 메소드를 public으로
    public int getSpeed() {
        return speed;
    }
}

class Car3 {
    private int speed;
    private String name;

    // setter만 작성하면 쓰기 전용 필드
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // getter만 작성하면 읽기 전용 필드
    public String getName() {
        return name;
    }
}