package ch15.leetcode.set.p442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // 중복 값을 가지는 List로 리턴

        List<Integer> result = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.add(n)) { // set에 추가되다가 안 들어가면
                result.add(n); // 그때의 값을 result list에 추가
            }
        }

        return result;
    }
}
