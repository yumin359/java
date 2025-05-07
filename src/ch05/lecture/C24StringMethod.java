package ch05.lecture;

public class C24StringMethod {
    public static void main(String[] args) {
        // java의 String은 변하지 않는다.(불변, immutable)

        // 대문자로 바꾸기
        String a = "Hello World";
        String b = a.toUpperCase();
        System.out.println("a = " + a); // Hello World
        System.out.println("b = " + b); // HELLO WORLD

        // 소문자로 바꾸기
        String c = a.toLowerCase();
        System.out.println("a = " + a); // Hello World
        System.out.println("c = " + c); // hello world
    }
}
