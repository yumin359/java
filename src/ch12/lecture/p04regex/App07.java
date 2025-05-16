package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App07 {
    public static void main(String[] args) {
        // [a-zA-Z0-9_] : \w
        // [0-9] : \d
        // [ ] : \s (공백-> 스페이스나 탭)
        // \ : \\ -> \\\\ -> 역슬래시를 나타내고 싶으면 패턴에 \\\\를 쓰고 데이터에 \\

        // . : 모든 글자
        // . : \. -> \\. -> .을 나타내고 싶으면 패턴에 \\.을 써야함
        System.out.println(Pattern.matches("\\w+", "asdfi24f_Dfds")); // T
        System.out.println(Pattern.matches("\\d+", "23434235353")); // T
        System.out.println(Pattern.matches("\\s+", "          ")); // T
        System.out.println(Pattern.matches("\\\\+", "\\")); // 역슬래시 한개를 표션

        System.out.println(Pattern.matches(".*", ""));
        System.out.println(Pattern.matches(".*", "ao0"));
        System.out.println(Pattern.matches(".*", "한글"));

        System.out.println(Pattern.matches("\\.", "."));
        System.out.println(Pattern.matches("\\.", "a")); // false

    }
}
