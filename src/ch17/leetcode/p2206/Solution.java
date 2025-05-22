package ch17.leetcode.p2206;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                e -> e,
                                Collectors.counting()
                        )
                );
        // 뭐누 진짜 다 못 들음
        // static import로 코드 줄이심
//                .collect(
//                        Collectors.groupingBy(
//                                e -> e,
//                                Collectors.counting()
//                        )
//                );

        // 아무튼 걍 가볍게 한거래요 .,,
        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .values()
                .stream()
                .allMatch(e -> e % 2 == 0);

    }
}
