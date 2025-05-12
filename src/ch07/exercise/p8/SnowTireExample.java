package ch07.exercise.p8;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire; // Tire가 SnowTire의 상위클래스라서 받을 수 있음
        // snowTire is a tire 이니까

        snowTire.run();
        tire.run();

    }
}
