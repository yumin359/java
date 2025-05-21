package ch15.exercise.p10;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return score - o.score;
    }

    // 제대로 정렬됐는지 확인하고 싶어서 내가 한거
    /*
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
     */
}
