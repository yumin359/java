package ch04.practice;

public class Exercise03_while_if {
    public static void main(String[] args) {

        int sum = 0;
        int num = 1;

        /*
        while (num <= 100) {
            if (num % 3 == 0) {
                sum += num;
                num++;
            } else {
                num++;
            }

            // if (num % 3 == 0) {
            //     sum += num;
            // }
            // num++;
        }
        */

        while (num <= 100) {
            while (num % 3 == 0) {
                sum += num;
                num++;
            }
            num++;

            // sum += num;
            // num += 3; // 이렇게 하려면 num은 처음에 0으로 선언해주기
        }


        System.out.println("1~100까지의 정수중에서 3의 배수 총합 = " + sum);
    }
}
