package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("a", "a")); // true
        System.out.println(Pattern.matches("a", "b")); // false

        // [] : character class
        System.out.println(Pattern.matches("[ab]", "a")); //true
        System.out.println(Pattern.matches("[ab]", "b")); //true
        System.out.println(Pattern.matches("[ab]", "ab")); //false
        System.out.println(Pattern.matches("[ab]", "ba")); //false
        System.out.println(Pattern.matches("[ab][ab]", "ab")); //true
        System.out.println(Pattern.matches("[ab][ab]", "aa")); //true
        System.out.println(Pattern.matches("[ab][ab]", "ba")); //true
        System.out.println(Pattern.matches("[ab][ab]", "bb")); //true

        // [] 안의 - : 범위
        System.out.println(Pattern.matches("[a-e]", "a")); // true
        System.out.println(Pattern.matches("[a-e]", "b")); // true
        System.out.println(Pattern.matches("[a-e]", "c")); // true
        System.out.println(Pattern.matches("[a-e]", "d")); // true
        System.out.println(Pattern.matches("[a-z]", "o")); // 소문자 한글자, true
        System.out.println(Pattern.matches("[A-Z]", "G")); // 대문자 한글자, true
        System.out.println(Pattern.matches("[A-Z]", "g")); // 대문자 한글자, false
        System.out.println(Pattern.matches("[0-9]", "3")); // 숫자
        System.out.println(Pattern.matches("[0-9a-zA-Z]", "3")); // 대소문자, 숫자
        System.out.println(Pattern.matches("[0-9a-zA-Z]", "t")); // 대소문자, 숫자
        System.out.println(Pattern.matches("[0-9a-zA-Z]", "V")); // 대소문자, 숫자
        System.out.println(Pattern.matches("[가-힣]", "손")); // 한글
        System.out.println(Pattern.matches("[가-힣]", "뷁")); // 한글
        System.out.println(Pattern.matches("[가-힣0-9a-zA-z]", "뷁")); // 한글, 영문대소문자, 숫자
        // 범위 안에 순서는 상관 없음

    }
}
