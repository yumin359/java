package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        // 아래에 선생님 코드

        // 키보드로 데이터 입력 받기

        // while -> 무한루프 멈출 변수 s1

        // switch 문으로
        // 1 2 3 4 5 선택변수 s

        // 각각 선택되면 선택된 거 문자열로 표시

        // 1. 계좌 생성 -> 키보드로 입력 받기
        // 계좌번호 입력
        // 계좌주 입력
        // 초기입금액 입력
        // 결과 문자열 표시

        // 2. 계좌목록
        // 계좌번호 계좌주 잔액 표시
        // 결과 문자열 표시
        // 잔액은 계속 += 나 -=

        // 3. 예금 -> 키보드 입력 받기
        // 계좌번호 입력
        // 예금액 입력 -> 잔액 += 예금액

        // 4. 출금 -> 키보드 입력 받기
        // 계좌번호 입력
        // 출금액 입력 -> 잔액 -= 출금액
        // 결과 문자열 표시

        // 5. 종료.

        // String 계좌번호 num , 계좌주 name
        // int 예금액 c , 출금액 d , 잔액 e
        // 계좌 정보 담을 배열 f

        /*
        Scanner scanner = new Scanner(System.in);
        String num, name; // 계좌번호, 계좌주
        // int c = 0, d = 0, e = 0; // 예금 출금 잔액
        String c, d, e; // 예금 출금 잔액
        // 얘네 계산할 때 Integer.parseInt 해서 해주기
        int s; // 번호 선택
        boolean s1 = true; // 무한루프 멈추기

        // 계좌정보
        String[][] f = new String[100][];
        int i = 0, j = 0; // 배열 위치?
        // 근데 꼭 같이 ? 출력 할 때 잘 하면 되나?
        // 일단 정보는 나중에

        while (s1) {
            System.out.println("--------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");

            s = Integer.parseInt(scanner.nextLine());

            switch (s) {
                case 1 -> {
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    num = scanner.nextLine(); // string 으로 받기
                    System.out.print("계좌주: ");
                    name = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    c = scanner.nextLine();  // 문자열로 받아야 할 것 같음

                    // num이랑 name이랑 c랑 담아둘 배열
                    //f[0][0] = num;
                    //f[0][1] = name;
                    //f[0][2] = c;

                    f[i][j] = num;
                    j++;
                    f[i][j] = name;
                    j++;
                    f[i][j] = c;
                    i++;
                    j = 0;

                    // e += c;
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case 2 -> {
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");


                }
                case 3 -> {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    // scanner
                    System.out.print("예금액: ");
                    // scanner

                    // 해당 계좌번호의
                    // 잔액 += 예금액;
                }
                case 4 -> {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    // scanner
                    System.out.print("출금액: ");
                    // scanner

                    // 해당 계좌번호의
                    // 잔액 -= 출금액;

                    System.out.println("결과: 출금이 성공되었습니다.");
                }
                case 5 -> s1 = false;
                default -> System.out.println("번호를 다시 입력하시오.");
            }
        }
        System.out.println("프로그램 종료");

        */

        // 여기부터 선생님이 하신거
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int numberOfAccount = 0;
        boolean run = true;
        while (run) {
            System.out.println("------------------------------");
            System.out.println("1.생성|2.목록|3.예금|4.출금|5.종료");
            System.out.println("------------------------------");
            System.out.print("선택>");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    // 계좌생성
                    System.out.println("-------");
                    System.out.println("계좌생성");
                    System.out.println("-------");
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("계좌주:");
                    String name = scanner.nextLine();
                    System.out.print("초기입금액:");
                    int balance = Integer.parseInt(scanner.nextLine());

                    Account account = new Account(number, name, balance);
                    accounts[numberOfAccount] = account;
                    numberOfAccount++;
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case "2" -> {
                    // 계좌목록보기
                    System.out.println("-------");
                    System.out.println("계좌목록");
                    System.out.println("-------");
                    for (int i = 0; i < numberOfAccount; i++) {
                        Account a = accounts[i];
                        System.out.println(a.getNumber() + "\t" + a.getName() + "\t" + a.getBalance());
                    }
                }
                case "3" -> {
                    // 예금
                    System.out.println("-------");
                    System.out.println("예금");
                    System.out.println("-------");
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("예금액:");
                    int money = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < numberOfAccount; i++) {
                        if (accounts[i].getNumber().equals(number)) {
                            accounts[i].setBalance(accounts[i].getBalance() + money);
                        }
                    }
                    System.out.println("예금이 성공되었습니다.");

                }
                case "4" -> {
                    // 출금
                    System.out.println("-------");
                    System.out.println("출금");
                    System.out.println("-------");
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("출금액:");
                    int money = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < numberOfAccount; i++) {
                        if (accounts[i].getNumber().equals(number)) {
                            accounts[i].setBalance(accounts[i].getBalance() - money);
                        }
                    }
                    System.out.println("출금이 성공되었습니다.");
                }
                case "5" -> {
                    // 종료
                    run = false;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
