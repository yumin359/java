package ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver d = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        d.drive(bus);
        d.drive(taxi);
    }
}
