package ch15.leetcode.list.p1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int a : arr) {
            input.add(a);
        }

        List<List<Integer>> result = new ArrayList<>();

        // 1. input 정렬
        Collections.sort(input);
        // 2. 인접한 두 값의 차가 가장 적은 차이를 구해서 저장->1번째탐색
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < input.size() - 1; i++) {
            diff.add(input.get(i + 1) - input.get(i));
        }
        int min = diff.get(0);
        for (int i = 0; i < diff.size(); i++) {
            if (min > diff.get(i)) {
                min = diff.get(i);
            }
        }
        // 3. 인접한 두 값의 차가 2번에서 구한 값과 같으면
        //    두 값을 원소로 갖는 List를 만들어서
        //    결과 List에 추가하기.
        for (int i = 0; i < input.size() - 1; i++) {
            if ((input.get(i + 1) - input.get(i) == min)) {
                List<Integer> r = new ArrayList<>();
                r.add(input.get(i));
                r.add(input.get(i + 1));
                result.add(r);
            }

        }

        return result;


        // 선생님 코드
        /*
        // 배열을 리스트로 만들어주는 거
        List<Integer> input = new ArrayList<>();
        for (int n : arr) {
            input.add(n);
        }

        // 결과 리스트 만들었음
        List<List<Integer>> result = new ArrayList<>();

        // 최솟값은 처음에 정수의 최대값을 설정함
        int min = Integer.MAX_VALUE;
        // 1. input 정렬
        Collections.sort(input);

        // 2. 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        for (int i = 0; i < input.size() - 1; i++) {
            Integer n1 = input.get(i);
            Integer n2 = input.get(i + 1);

            int diff = n2 - n1;

            min = Math.min(min, diff); // 더 작은 값 구하는 간단한 것
        }
        // 3. 인접한 두 값의 차가 (2)에서 구한 값과 같으면
        for (int i = 0; i < input.size() - 1; i++) {
            Integer n1 = input.get(i);
            Integer n2 = input.get(i + 1);
            int diff = n2 - n1;
            if (diff == min) {
                //    두 값을 원소로 갖는 List를 만들어서
                //    결과 list에 추가 하기
                List<Integer> row = new ArrayList<>();
                row.add(n1);
                row.add(n2);

                result.add(row);
            }
        }


        return result;

         */
    }
}
