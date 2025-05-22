package ch17.sec12.exam03;

import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("hong", "m", 92));
        totalList.add(new Student("kim", "f", 87));
        totalList.add(new Student("java", "m", 95));
        totalList.add(new Student("oh", "f", 93));

        Map<String, Double> map = totalList.stream()
                .collect(
                        groupingBy(
                                Student::getSex,
                                averagingDouble(Student::getScore)
                        )
                );
        System.out.println(map);
    }
}
