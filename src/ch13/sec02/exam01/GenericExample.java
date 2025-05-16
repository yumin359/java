package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        // 즉 타입변환 없이 안전하게 쓸 수 있다!
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        //----------------------------------------------------
        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
