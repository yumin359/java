package ch04.lecture;

import java.util.Scanner;

public class C10IfSwitch {
    public static void main(String[] args) {
        // switch 값 == 비교
        // switch는 값을 비교할 때 씀

        Scanner scanner = new Scanner(System.in);
        System.out.print("등급:");
        String grade = scanner.nextLine();

        switch (grade) {
            case "A", "a" -> System.out.println("최우수");
            case "B", "b" -> System.out.println("우수");
            case "C", "c" -> System.out.println("양호");
            default -> System.out.println("미흡");
        }
    }
}
