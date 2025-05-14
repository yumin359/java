package ch08.lecture.p06etc;

public class App01 {
    public static void main(String[] args) {
        System.out.println(MyInterface01.AGE);
        System.out.println(MyInterface01.HOME_ADDRESS);
    }
}

interface MyInterface01 {
    // public static final 필드
    public static final int AGE = 1;
    // 여기서 public static final 안 써도 쓰임
    String HOME_ADDRESS = "seoul";
    // public 추상메소드
}