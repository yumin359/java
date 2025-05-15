package ch12.exercise.p05;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        // Student를 저장하는 HashSet 생성
        HashSet<Student> hashSet = new HashSet<Student>();

        // Student 저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1")); // 같은 숫자라 중복 저장 안 됨
        hashSet.add(new Student("2"));

        // 저장된 Student 수 출력
        System.out.println("hashSet.size() = " + hashSet.size());
    }
}
