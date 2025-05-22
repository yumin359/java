package ch17.leetcode.p2114;

import java.util.Arrays;

class Solution {
    public int mostWordsFound(String[] sentences) {
        // 고전적 for
        /*
        int max = 0;
        for (String s : sentences) {
            int length = s.split(" ").length;
            max = Math.max(max, length);
        }
        return max;
         */

        // Stream
        return Arrays.stream(sentences)
                .map(s -> s.split(" "))
                .mapToInt(s -> s.length)
                .max()
                .getAsInt();

    }
}
