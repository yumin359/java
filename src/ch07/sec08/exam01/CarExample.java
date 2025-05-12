package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.tire = new Tire();
        c.run();

        c.tire = new HankookTire();
        c.run();

        c.tire = new KumhoTire();
        c.run();
    }
}
