package ch07.sec02;

public class SmartPhonExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("myPhone.model = " + myPhone.model);
        System.out.println("myPhone.color = " + myPhone.color);

        System.out.println("myPhone.wifi = " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕 나 신유망");
        myPhone.sendVoice("반가워요");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();

    }
}
