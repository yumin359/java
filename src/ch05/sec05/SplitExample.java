package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {

        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] tokens = board.split(",");

        System.out.println("tokens[0] = " + tokens[0]);
        System.out.println("tokens[1] = " + tokens[1]);
        System.out.println("tokens[2] = " + tokens[2]);
        System.out.println("tokens[3] = " + tokens[3]);
        System.out.println();

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        // 5장 열거타입이랑 확인문제 9번은 나중에 할게용
        // 낼부터 6장..!
    }
}
