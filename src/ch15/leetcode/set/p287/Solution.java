package ch15.leetcode.set.p287;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {
        // nums의 모든 요소를 탐색해서 set에 넣고
        // 넣을 때 결과가 false면 이미 있던 값이니까 리턴

        Set<Integer> set = new HashSet<>();

        for (int n : nums) { // 중복이 안 된다는 특징을 이용해서 푼 문제
            if (!set.add(n)) { // n을 set에 넣는데 중복이면 false니까
                // !fasle = true 해서
                return n; // 그때의 중복값 n을 리턴한다.
            }
        }

        return 0;
    }
}