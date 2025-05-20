package ch15.exercise.p09;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        // 선생님
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // 가장 높은 점수 인지?
            if (maxScore < entry.getValue()) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }

            // 점수 합
            totalScore += entry.getValue();

        }

//        totalScore /= map.size(); // 이러면 Integer 연산이 되어
        double avg = (double) totalScore / map.size(); // 이렇게 해줘야ㅕ함
//        System.out.println("평균 점수: " + totalScore);
        System.out.println("평균 점수: " + avg);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);


        // 이름 못 가져옴
        /*
        for (String s : map.keySet()) {
            int v = map.get(s);
            totalScore += v;

            if (maxScore <= v) {
                maxScore = v;

            }
        }
        totalScore /= map.size();
        System.out.println("평균 점수: " + totalScore);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);

         */

    }
}
