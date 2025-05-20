package ch15.leetcode.map.p2206;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean divideArray(int[] nums) {
        // nums 안에 각 요소들이 짝수개로 있는가
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                // n이 map에 있으면
                // Integer v = map.get(n);
                map.put(n, map.get(n) + 1);

            } else {
                // n이 map에 없으면
                map.put(n, 1);
            }
        }

// 선생님 코드
/*
        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                return false;
            }
        }
        return true;
*/
        boolean b = true;
        // map을 전체탐색해서 각 요소들이 모두 각각 짝수개로 있는지 확인
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if ((entry.getValue() % 2) == 1) {
                b = false;
                break;
            }
        }

        return b;
    }
}
