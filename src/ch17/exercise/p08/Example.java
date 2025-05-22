package ch17.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                // 주석은 내가 한 거
//                .collect(Collectors.groupingBy(s -> s.getJob().equals("개발자") ? "개발자" : "디자이너"));
                .collect(Collectors.groupingBy(Member::getJob));


        System.out.println("[개발자]");
        List<Member> develop = groupingMap.get("개발자");
        develop.forEach(System.out::println);
        // 아래처럼 하면 한줄로 되네염 ;;ㅎ
        groupingMap.get("개발자").forEach(System.out::println);

        System.out.println();

        System.out.println("[디자이너]");
        List<Member> design = groupingMap.get("디자이너");
        design.forEach(System.out::println);
        // 얘도 .. ㅎ
        groupingMap.get("디자이너").forEach(System.out::println);

    }
}
