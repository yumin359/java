package ch02.lecture;

import java.util.Scanner;

public class C22Scanner {
    public static void main(String[] args) {
        System.out.println("두 값 더해서 출력");
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째값:");
        int s = scanner.nextInt();

        System.out.print("두번째값:");
        int t = scanner.nextInt();

        System.out.println("더한 값 = " + (s + t));

        System.out.println("프로그램 종료");

        // nextLine으로 일단 쓰세용
    }
}
