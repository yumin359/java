package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        // Vehicle Bus = new Bus();

        vehicle.run(); // 버스가 달립니다.

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
