package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App08 {
    public static void main(String[] args) {
        // () : 그룹

        System.out.println(Pattern.matches("(\\d{3} )+", "342 "));// 숫자3개나오고공백하나가 여러개
        System.out.println(Pattern.matches("(\\d{3} )+", "342 344 "));// 숫자3개나오고공백하나 여러개
        System.out.println(Pattern.matches("(\\d{3} )+", "342 344 987 "));// 숫자3개나오고공백하나 여러개
    }
}
