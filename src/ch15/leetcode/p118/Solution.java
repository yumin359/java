package ch15.leetcode.p118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    row.add(1);
                } else {
                    int left = triangle.get(i - 1).get(j - 1);
                    int right = triangle.get(i - 1).get(j);
                    row.add(left + right);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
