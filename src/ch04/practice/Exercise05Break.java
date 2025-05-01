package ch04.practice;

public class Exercise05Break {
    public static void main(String[] args) {
        // 아래 주석처럼 해야 더 잘 쓴 코드겠지 아무래도
        int a = 0;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if ((4 * i) + (5 * j) == 60) {
                    System.out.println(i + ", " + j);
                    a = 1;
                }
                if (a == 1) {
                    break;
                }
                // 이렇게 하면 안에 for문만 break 걸려서
                // a가 계속 1이니까 5,8 나온 후부터는 사실상 밖에 for문만 돌아가서
                // 6,1 7,1 8,1 9,1 10,1 하다가
                // 그냥 동작이 끝나서(for문 다 돌아서) 멈추는 거
            }
        }


        // 요기!!
        /*
        boolean gotcha = false;
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println(x + ", " + y);
                    gotcha = true;
                }
            }
            if (gotcha) {
                break;
            }
            // 얘는 밖에 for문에 가깝게 있어서
            // 안에 for문에서 5,8 되면 gotcha가 true 되고, 5,9 5,10 돈다음에
            // 5, 10 됐을 때 gotcha = true라 바로 동작 멈춤
        }

         */

    }
}
