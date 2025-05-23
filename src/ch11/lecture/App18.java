package ch11.lecture;

public class App18 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {

        // checked 예외 던지기(발생)
        throw new Exception();

        // throw는 실제로 던지는거
        // throws는 명시를 한 거
    }
}
