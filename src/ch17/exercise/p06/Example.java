package ch17.exercise.p06;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        // 고전적 for
        double sum = 0;
        for (Member member : list) {
            sum += member.getAge();
        }
        double avg0 = sum / list.size();
        System.out.println("avg0 = " + avg0);

        // 참조타임스트림
        Integer sum2 = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum);
        Double avg2 = sum2.doubleValue() / list.size();
        System.out.println("avg2 = " + avg2);


        // 기본타입스트림
        // 혹은 OptionalDouble로 하면 average()로 해서 끝낼 수 있음
        double avg = list.stream()
                .mapToDouble(Member::getAge)
                .average()
                .getAsDouble();
//                .orElse(0.0); // 값이 없을 경우 0.0 반환

        System.out.println("avg = " + avg);

    }
}
