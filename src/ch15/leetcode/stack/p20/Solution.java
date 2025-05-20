package ch15.leetcode.stack.p20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        // 진짜 버그땜에 혼자서 하나도 못함 ㅠ 선생님 코드 ..
        
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // 닫힌 괄호면
            // stack에서 pop 한 것과 비교
            // 매치가 되면 계속 진행, 아니면 return false
            switch (c) {
                case ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '[') {
                        return false;
                    }
                }
                case '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '{') {
                        return false;
                    }
                }
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '(') {
                        return false;
                    }
                }
                default -> { // 열린 괄호면 stack에 push
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty();
    }
}
