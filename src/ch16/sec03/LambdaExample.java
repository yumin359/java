package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            // action1이 호출되면서 Workable이 구현되어
            // workable.work("홍길동", "프로그래밍")이라서
            // (name, job) -> (홍길동, 프로그래밍) 되니까
            // 출력하면
            // 홍길동이
            // 프로그래밍을 합니다.
            // 가 출력되는것!
            System.out.println(name + "이 ");
            System.out.println(job + "을 합니다.");
        });
        person.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));

        person.action2(word -> {
            System.out.println("\"" + word + "\"");
            System.out.println("라고 말합니다.");
        });
        person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));

    }
}
