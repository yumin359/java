package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 0;
        long var2 = 20L;
//        long var3 = 100000000000;
        // underscore(underbar)로 자릿수 표시 가능
        long var4 = 100_000_000_000_000L;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);
    }
}
