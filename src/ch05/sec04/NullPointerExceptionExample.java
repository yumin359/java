package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        // intArray[0] = 10;
        // 애초에 쓸 수가 없는거고

        String str = null;
        // System.out.println("총 문자수: " + str.length());
    }
}
