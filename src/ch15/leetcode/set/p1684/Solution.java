package ch15.leetcode.set.p1684;

import java.util.HashSet;
import java.util.Set;

// 선생님 코드
public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // allowed에 있는 각 문자(Character)를 저장한 Set 만들기
        // 1. Set 만들고
        Set<Character> set = new HashSet<>();
        // 2. allowed의 각 문자를 탐색해서
        // 3. Set에 넣고(add)
        for (char c : allowed.toCharArray()) {
            // 3. Set에 넣고(add)
            set.add(c);
        }

        int count = 0;
        // words에 있는 각 문자열을 전체 탐색해서 각 문자열의 문자가 allowed에 있는 지 확인
        // 1. words의 각 문자열(word) 탐색
        //    1. word의 각 문자(character)가
        //    2. Set에 있는 지 확인(contains))
        //    3. 모두 다 있으면 count 늘리기
        for (String word : words) {
            boolean checked = true;
            //    1. word의 각 문자(character)가
            for (char c : word.toCharArray()) {
                //    2. Set에 있는 지 확인(contains))
                if (!set.contains(c)) {
                    // contains : 모든 문자 중에 이 문자(->()안의 문자)가 있는가?를
                    // 확인하는 연산
                    checked = false;
                    break;
                }
            }
            //    3. 모두 다 있으면 count 늘리기
            if (checked) {
                count++;
            }

        }


        // return count
//        return 0;
        return count;
    }
}

// perplexity와 약간의 gpt
// 선생님이랑 perplexity는 코드 완전 같당 ㄷㄷ
/*
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> a = new HashSet<>();
        for (char s : allowed.toCharArray()) {
            a.add(s);
        }

        int count = 0;

        for (String word : words) {
            // for (int i = 0; i < words.length; i++ { 로 하면
            boolean isConsistent = true;
            for (char w : word.toCharArray()) {
                // for (char w : words[i].toCharArray()) { 가 됨. 나머진 같음
                // 0번 인덱스의 문자열부터 해당 문자열을 문자 배열로 변환
                if (!a.contains(w)) {
                    // 그때의 문자 w가 a에 포함되지 않으면
                    isConsistent = false; // false이고
                    break; // 해당 for 문이 정지되어
                    // 다음 인덱스의 문자열을 검사
                }
            }
            if (isConsistent) {
                // 문제 없으면 바로 위의 for 문이 다 돌고 여기로 넘어와서
                count++; // count 증가
            }
        }

        return count;
    }
}
*/

/*
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Set 말고도 푸는 방법은 많대여 다만 우리는 공부하니까..

        // allowed 는 문자열로만 구성되어져 있는 것을 찾는ㄱ 거 -> 바뀌지 않음
        // words 는 문자열배열 -> 계속 새롭게 만들어지게 ㄱㄱ

        // allowed에 있는 각 문자(Character)를 저장한 Set 만들기
        // 1. Set 만들고
        // 2. allowed 의 각 문자를 탐색해서
        // 3. set에 넣고(add)
        Set<Character> a = new HashSet<>();
        for (char s : allowed.toCharArray()) { // toCharArray: 문자열은 문자 배열로 변환
            // 그냥 allowed 하면 안 됨.
            a.add(s); // a = [ , , , ...] 된다.
        }
        //
        // words에 있는 각 문자열을 전체 탐색해서 각 문자열의 문자가 allowed에 있는 지 확인
        // 1. words의 각 문자열(word) 탐색
        //    1. word의 각 문자(Character)가
        //    2. Set에 있는지 확인(contains)
        //    3. 모두 다 있으면 count 늘리기.

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            Set<Character> word = new HashSet<>();
            // word는 words의 인덱스 바뀔 때마다 초기화
            for (char w : words[i].toCharArray()) {
                // 각 인덱스의 문자열의 문자 각각 저장
                word.add(w);
            }
            if (a.contains(word)) {
                count++;
            }
        }

        return count;
        // return 0;
    }
}
*/

