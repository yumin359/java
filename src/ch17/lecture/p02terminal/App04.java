package ch17.lecture.p02terminal;

import java.util.List;

public class App04 {
    public static void main(String[] args) {

        // reduce : 집계 연산

        List<String> list = List.of("java", "spring", "css", "html", "sql");

        // 모든 요소 연결
        String r1 = list.stream() // 첫번째 파라미터에 들어가는게 꼭 하나 생기니까 Optional 리턴 X
                .reduce("", (a, b) -> a + b);
        System.out.println("r1 = " + r1);

        Integer r2 = list.stream()// 얘도 초기값 0이 처음에 들어가니까 Optional 리턴 X
                .map(s -> s.length())
                .reduce(0, (a, b) -> a + b);
        System.out.println("r2 = " + r2);

        // App03이랑 결과는 같은데 Optional을 리턴하지 않는다는 차이가 있음!
    }
}
