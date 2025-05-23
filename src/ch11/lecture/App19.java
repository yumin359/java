package ch11.lecture;

public class App19 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (HungryException e) {
            e.printStackTrace();
        }
    }

    public static void method1() {
        throw new HungryException("점심 때라 배고파");
    }
}

// 필요하면 Exception을 만들어서 사용할 수 있다.
// 직접 필요한 Exception을 만들어서 사용할 수 있음.
class HungryException extends RuntimeException {
    // 생성자 생성
    HungryException() {
        super("그냥 배고파");
    }

    public HungryException(String message) {
        super(message);
    }
}