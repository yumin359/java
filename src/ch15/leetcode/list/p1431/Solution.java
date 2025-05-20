package ch15.leetcode.list.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        // 1. kids List에서 가장 큰 값 구하기
//        for (int i = 0; i < kids.size(); i++) {
//            System.out.println(kids.get(i));
//        }
        int a = kids.get(0);
        for (int i = 0; i < kids.size(); i++) {
            if (a < kids.get(i)) {
                a = kids.get(i);
            }
        }

        // 2. List<Boolean> result 객체 만들기
        List<Boolean> result = new ArrayList<>();

        // 3. kids의 각 요소에 extraCandy 더해서, 1에서 구한 가장 큰 값 보다 크거나 같으면
        //    result에 true 추가
        //    아니면 false 추가
        // result.add
        for (int i = 0; i < kids.size(); i++) {
            if (kids.get(i) + extraCandies >= a) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        // result 리턴
        return result;
    }
}
