package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100; // boxing
        System.out.println("obj.intValue() = " + obj.intValue());

        int value = obj; // unboxing
        System.out.println("value = " + value);

        int result = obj + 100; // 연산 시 unboxing
        System.out.println("result = " + result);
    }
}
