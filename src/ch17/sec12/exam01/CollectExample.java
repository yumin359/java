package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("hong", "man", 92));
        totalList.add(new Student("kim", "woman", 87));
        totalList.add(new Student("gam", "man", 95));
        totalList.add(new Student("oh", "woman", 93));

        // 고전 for문 사용
        List<Student> mList = new ArrayList<>();
        for (Student s : totalList) {
            if (s.getSex().equals("man")) {
                mList.add(s);
            }
        }
//        System.out.println(mList); // toString 재정의 해야 잘나옴

        // 스트림 사용
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("man"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // 고전 for문 사용
        Map<String, Integer> map1 = new HashMap<>();

        for (Student s : totalList) {
            map1.put(s.getName(), s.getScore());
        }

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println();

        // 스트림 사용
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(), // Student::getName
                                s -> s.getScore() // Student::getScore
                        )
                );
        System.out.println(map); // map은 순서보장 X

        map.entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}
