package ch06.exercise.p13;

public class App01 {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.setName("donald");
        m1.setAge(99);
        System.out.println("m1.getName() = " + m1.getName());
        System.out.println("m1.getAge() = " + m1.getAge());

        Member m2 = new Member();
        m2.setName("trump");
        m2.setAge(88);
        System.out.println("m2.getName() = " + m2.getName());
        System.out.println("m2.getAge() = " + m2.getAge());

    }
}
