package ch17.sec12.exam02;

import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("hong", "m", 92));
        totalList.add(new Student("kim", "f", 87));
        totalList.add(new Student("java", "m", 95));
        totalList.add(new Student("oh", "f", 93));

        Map<String, List<Student>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())
                );

        List<Student> mList = map.get("m");
        mList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> fList = map.get("f");
        fList.stream().forEach(s -> System.out.println(s.getName()));
    }
}
