package ch17.sec12.exam01;

public class Student {
    private String name;
    private String sex;
    private int score;

    public Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getScore() {
        return score;
    }
}
