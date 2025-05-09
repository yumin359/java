package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.setSpeed(-50);
        System.out.println("c.getSpeed() = " + c.getSpeed());

        c.setSpeed(60);
        System.out.println("c.getSpeed() = " + c.getSpeed());

        if (!c.isStop()) {
            c.setStop(true);
        }
        System.out.println("c.getSpeed() = " + c.getSpeed());
    }
}
