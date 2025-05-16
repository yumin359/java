package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App09 {
    public static void main(String[] args) {
        // | : or -> 역슬래시랑 같이 있는ㄱ ㅓ

        System.out.println(Pattern.matches("(ab|12)", "ab"));
        System.out.println(Pattern.matches("(ab|12)", "12"));
        System.out.println(Pattern.matches("(ab|12)+", "12"));
        System.out.println(Pattern.matches("(ab|12)+", "12ab12abab12"));
    }
}
