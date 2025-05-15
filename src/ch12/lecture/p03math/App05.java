package ch12.lecture.p03math;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App05 {
    public static void main(String[] args) {
        System.out.println("*** 1~10 사이의 수 3개 맞추기 게임 ***");
        Scanner scanner = new Scanner(System.in);
        // 1~10 숫자 3개 맞추는 게임
        // 1. 사용자에게 3개의 숫자 입력 받고
        System.out.println("3개의 숫자를 ,로 구분해서 입력해 주세요.");
        System.out.print("입력> ");
        String line = scanner.nextLine();
        String[] numbers = line.split(",");
        int[] num = {
                Integer.parseInt(numbers[0]),
                Integer.parseInt(numbers[1]),
                Integer.parseInt(numbers[2])
        };
        // 2. 컴퓨터가 3개 숫자 임의로 뽑아서
        int count = 0;
        int[] coms = new int[3];
        Random random = new Random();
        while (count < 3) {
            int r = random.nextInt(10) + 1;
            boolean alreadyHave = false;
            for (int i = 0; i < coms.length; i++) {
                if (r == coms[i]) {
                    alreadyHave = true;
                }
            }
            if (!alreadyHave) {
                coms[count] = r;
                count++;
            }
        }

        // 중간 출력
        System.out.println("사용자: " + Arrays.toString(num));
        System.out.println("사용자: " + Arrays.toString(coms));

        // 3. 몇 개 일치하는 지 확인
        int right = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < coms.length; j++) {
                if (num[i] == coms[j]) {
                    right++;
                }
            }
        }
        switch (right) {
            //   - 3개 다 맞으면 1등
            //   - 2개 맞으면 2등
            //   - 1개 맞으면 3등
            //   - 0개면 꽝
            case 3 -> System.out.println("1등. 축하 3개 다 맞음");
            case 2 -> System.out.println("2등. 2개 맞춤");
            case 1 -> System.out.println("3등. 1개 맞춤");
            default -> System.out.println("꽝. 하나도 못 맞춤");
        }
        System.out.println("*** 게임 종료 ***");
    }
}
