package ch04.practice;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        // 키보드로 데이터 입력 받기

        // 예금액 a , 출금액 b , 잔고 c  변수
        // 1~4 선택 변수 s

        // while로 한다면 무한루프 멈출 s1 변수

        // 잔고 값
        // 처음에 0
        // 입금되면 a를 더하는거고 -> c += a;
        // 출금되면 b를 빼는거 -> c -= b;


        // switch 문으로
        // 1일 때 예금액
        // 2일 때 출금액
        // 3일 때 잔고
        // 4일 때 종료하기

        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        int s;

        boolean s1 = true;
        while (s1) {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");

            s = Integer.parseInt(scanner.nextLine());
            // Integer로 받아서 밑에 case 하고 바로 숫자 쓴 거
            // 만약 String 으로 받았으면 "숫자" 해주면 됨.

            switch (s) {
                case 1 -> {
                    System.out.print("예금액>");
                    a = Integer.parseInt(scanner.nextLine());
                    c += a;
                }
                case 2 -> {
                    System.out.print("출금액>");
                    b = Integer.parseInt(scanner.nextLine());
                    c -= b;
                }
                case 3 -> {
                    System.out.println("잔고>" + c);
                }
                case 4 -> s1 = false;
                default -> System.out.println("번호를 다시 입력하시오.");
            }

        }

        System.out.println("프로그램 종료");

        /*
        do {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");

            s = Integer.parseInt(scanner.nextLine());

            switch (s) {
                case 1 -> {
                    System.out.print("예금액>");
                    a = Integer.parseInt(scanner.nextLine());
                    c += a;
                }
                case 2 -> {
                    System.out.print("출금액>");
                    b = Integer.parseInt(scanner.nextLine());
                    c -= b;
                }
                case 3 -> {
                    System.out.println("잔고>" + c);
                }
                default -> {
                    if (s != 4) {
                        System.out.println("번호를 다시 입력하시오.");
                    }
                }
            }

        } while (s != 4);

        System.out.println("프로그램 종료");
        */

    }
}
