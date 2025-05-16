package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.content = "안녕하세요";
        String str = b1.content;
        System.out.println(str);

        Box<Integer> b2 = new Box<>();
        b2.content = 100;
        int value = b2.content;
        System.out.println(value);
        
    }
}
