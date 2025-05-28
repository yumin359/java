package ch21.sec01;

public class VarExample1 {
    public static void main(String[] args) {
        String name = getData();
        var userName = getData();
        System.out.println("name = " + name);
        System.out.println("userName = " + userName);
    }

    public static String getData() {
        return "홍길동";
    }
}
