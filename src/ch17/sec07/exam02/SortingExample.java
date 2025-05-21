package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));

        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(System.out::println);
        System.out.println();

        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(System.out::println);
        System.out.println();

        studentList.stream()
                // 이름 순으로 하겠다.
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(System.out::println);


    }
}
