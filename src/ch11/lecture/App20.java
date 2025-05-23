package ch11.lecture;

public class App20 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (AngryException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws AngryException {
        // 여기서 쓸 건 아니니 여기서 잡을 필욘 없으니 거의 throws로?
        throw new AngryException("직접 메세지 작성");
    }
}

// 필요해서 직접 만든 Excepton(인데 Exception을 상속받아서 checked exception)
class AngryException extends Exception {
    public AngryException() {
        super("기본 메세지"); // 써도 되고 안 써도 되고
    }

    public AngryException(String message) {
        super(message);
    }
}