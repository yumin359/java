package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.setGas(5);

        if (c.isLeftGas()) {
            System.out.println("출발합니다.");
            c.run();
        }
        System.out.println("gas를 주입하세요");
    }
}
