package ch12.lecture.p01object;

public class App04 {
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String("java");

        // 참조값이 같은가?
        System.out.println(a == b); // false

        // equals : 내용물이 같은가?
        System.out.println(a.equals(b)); // true
        // -> String equals api 에서 보면 재정의가 이렇게 되너있음
    }
}
