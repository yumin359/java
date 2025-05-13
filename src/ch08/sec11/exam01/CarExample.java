package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.run(); // 한국 한국

        c.tire1 = new KumhoTire();
        c.tire2 = new KumhoTire();

        c.run(); // 금호 금호
    }
}
