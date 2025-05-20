package ch15.leetcode.list.p118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        // result 리스트에 첫 행은 항상 [1]
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1); // [1]
        result.add(firstRow); // [[1]]

        // 2번째 행부터 작성 j=1
        for (int j = 1; j < numRows; j++) {

            List<Integer> prev = result.getLast(); // 이전행
            // getLast()는 LinkedList에서 사용?, java21이상에서 사용?
            // result.get(result.size() - 1) 로 바꿔서 사용해야함
            List<Integer> row = new ArrayList<>(); // 특정행
            result.add(row); // 여기있어도 되고
            // 생성된 행을 바로 결과에 추가

            row.add(1);

            // 중간의 값들
            for (int i = 0; i < prev.size() - 1; i++) {
                int n1 = prev.get(i);
                int n2 = prev.get(i + 1);
                row.add(n1 + n2);
            }

            row.add(1);
//            result.add(row); // 여기있어도 됨
            // 같은 참조값을 가져서
        }


        return result;
    }
}
