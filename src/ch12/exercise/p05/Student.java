package ch12.exercise.p05;

import java.util.Objects;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentNum);
    }
}
