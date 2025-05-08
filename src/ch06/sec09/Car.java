package ch06.sec09;

public class Car {
    String model;
    int speed;

    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
    }
    // 멤버끼리 서로 접근해서 쓰고 있따.
    // 가리지 않는다면 그냥 쓰고
    // 가리고 있다면 this 써주기
    // 멤버 메소드, 멤버 필드라고도 한다
}
