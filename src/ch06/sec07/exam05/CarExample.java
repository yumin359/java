package ch06.sec07.exam05;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car("자가용");
        Car c2 = new Car("자가용", "빨강");
        Car c3 = new Car("택시", "검정", 200);

        System.out.println("c1.company = " + c1.company);
        System.out.println("c1.model = " + c1.model);
        System.out.println("c1.color = " + c1.color);
        System.out.println("c1.maxSpeed = " + c1.maxSpeed);
        System.out.println();
        System.out.println("c2.company = " + c2.company);
        System.out.println("c2.model = " + c2.model);
        System.out.println("c2.color = " + c2.color);
        System.out.println("c2.maxSpeed = " + c2.maxSpeed);
        System.out.println();
        System.out.println("c3.company = " + c3.company);
        System.out.println("c3.model = " + c3.model);
        System.out.println("c3.color = " + c3.color);
        System.out.println("c3.maxSpeed = " + c3.maxSpeed);
        System.out.println();
    }
}

// p214
// 필드선언
// 생성자선언
// 메소드선언
// 그림 있는