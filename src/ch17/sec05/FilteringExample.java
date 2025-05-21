package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = List.of("홍길동", "신용권", "감자바", "신용권", "신민철");
        // 출력할 때 조건에 따라 출력이 달라지는 것이고 실제 값이 달라지는 게 아니라서 쓸 수 있는건가?
        // 맞대여

        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(System.out::println);

    }
}
