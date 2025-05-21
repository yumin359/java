package ch15.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));
        treeSet.add(new Student("red", 96)); // 점수가 같아서 같은 객체로 봄
        // 따로 보게 하고 싶으면 Student 클래스의 CompareTo 메소드 수정해주면 됨
        System.out.println(treeSet.size());
        //treeSet.forEach(System.out::println);

        Student student = treeSet.last();
        System.out.println("최고 점수: " + student.score);
        System.out.println("최고 점수를 받은 아이디: " + student.id);
        //
    }
}
