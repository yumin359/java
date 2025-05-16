package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        // 02나 010로 시작하고 - 가 오고
        // 0-9까지의 숫자가 3~4개 오고 - 가 오고
        // 0-9까지 숫자가 4개 온다.
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        // a-zA-Z0-9_가 1개이상 으로 시작하고 @가 오고
        // a-zA-Z0-9_가 1개이상 오고, .이 오고 a-zA-Z0-9_ 1개이상 오고
        // (.이 오고 a-zA-Z0-9_가 1개 이상 오는 것)은 0~1개 온다.-> 있어도되고 없어도 되고
        // tukorea.ac.kr 이런거!! .
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
    }
}
//gpt
// ^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$
// perplexity
// ^[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-z]+$