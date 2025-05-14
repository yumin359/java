package ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.run1(); // 일반 익명자식 1

        c.run2(); // 익명자식 2

        c.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        }); // 익명자식 3

        c.run3(new Tire()); // 일반
    }
}
