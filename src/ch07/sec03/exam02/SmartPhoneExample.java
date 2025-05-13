package ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone("갤럭시", "은색");
        System.out.println("p.model = " + p.getModel());
        System.out.println("p.color = " + p.getColor());
    }
}
