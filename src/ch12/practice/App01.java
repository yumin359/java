package ch12.practice;

import java.util.Random;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        // 컴퓨터와 가위바위보 게임하기
        // 1. 사용자에게 가위 바위 보 중에 키보드로 입력받기
        // 2. 컴퓨터는 랜덤하게 가위 바위 보 중에 고르기
        // 3. 사용자와 컴퓨터 간에 결과(이김 비김 짐) 출력하기
        // 4. 종료 선택시(입력) 프로그램 종료

        // 내 코드
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int m = 0;
        String s1;
        boolean b = true;

        while (b) {
            System.out.println("--------------");
            System.out.println("가위바위보게임");
            System.out.println("--------------");
            System.out.println("가위,바위,보,종료");
            System.out.print("중에 하나를 입력> ");
            String str = s.nextLine();

            // 내 값 출력
            switch (str) {
                case "가위" -> m = 1;
                case "바위" -> m = 2;
                case "보" -> m = 3;
                case "종료" -> b = false;
                default -> m = 0;
            }

            if (b != false) {
                // 컴퓨터 값 출력
                int r1 = r.nextInt(3) + 1;
                s1 = switch (r1) {
                    case 1 -> "가위";
                    case 2 -> "바위";
                    default -> "보";
                };
                if (m != 0) System.out.println("컴퓨터 입력> " + s1);

                if (m == 0) {
                    System.out.println("다시 입력하세요.");
                } else if (m > r1) {
                    System.out.println("이김");
                } else if (m == r1) {
                    System.out.println("비김");
                } else {
                    System.out.println("짐");
                }
            }
        }

        System.out.println("프로그램 종료");
    }
}
