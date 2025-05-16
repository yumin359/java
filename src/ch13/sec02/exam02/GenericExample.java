package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency ha = new HomeAgency();
        Home h = ha.rent();
        h.turnOnLight();

        CarAgency ca = new CarAgency();
        Car c = ca.rent();
        c.run();
    }
}
