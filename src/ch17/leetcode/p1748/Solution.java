package ch17.leetcode.p1748;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int sumOfUnique(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .mapToInt(e -> e.getKey())
                .sum();

    }
}
