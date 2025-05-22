package ch17.leetcode.p1431;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 최대값 구하기
        int max = Arrays.stream(candies)
                .max()
                .orElse(0); // 처음에 return으로 받아서 자꾸 error ,,

        return Arrays.stream(candies)
                .map(s -> s + extraCandies)
                .mapToObj(s -> s >= max)
                .toList();
    }
}