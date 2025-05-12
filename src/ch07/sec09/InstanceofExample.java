package ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        // 파라미터가 Person person을 받으니까
        // Student면 강제형변환을 해줘야함.

        System.out.println("person.name = " + person.name);
        person.walk();

        /*
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("student.studentNo = " + student.studentNo);
            student.study();
        }
         */
        // 위아래 같은 코드인데 아래 코드로 더 잘 사용
        // 근데 애초에 이런일을 별로 안 한대여
        if (person instanceof Student student) {
            // 그래서 형변환 되는지 확인하고 되면 강제형변환해줘서
            System.out.println("student.studentNo = " + student.studentNo);
            student.study(); // 이게 실행될 수 있는거
        }

    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
