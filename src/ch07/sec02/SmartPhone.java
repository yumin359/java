package ch07.sec02;

public class SmartPhone extends Phone {
    // 현재 Phone 클래스에서
    // 필드 2개, 메소드 4개 상속받은 상태

    public boolean wifi;

    // 이런 코드는 별로 안 만들어진대여
    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("wifi 상태 변경");
    }

    public void internet() {
        System.out.println("internet 연결");
    }
}
