package ch03.lecture;

public class C12ShortCircuit {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // short circuit
        // 보통 이렇게 쓰면 됩니도
        boolean r1 = ((a++) < 0) && ((b++) > 0);
        System.out.println("r1 = " + r1);
        System.out.println("a = " + a);
        System.out.println("b = " + b); // b는 연산을 안 했으니 그대로 3!

        a = 5;
        b = 3;
        boolean r2 = ((a++) < 0) & ((b++) > 0);
        System.out.println("r2 = " + r2);
        System.out.println("a = " + a);
        System.out.println("b = " + b); // b연산을 해서 4가 됩니동
    }
}
