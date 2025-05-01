package ch04.practice;

public class C03NestedFor {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         */
        System.out.println("------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {   // j<i+1 또는 j<=i
                System.out.print("*");          // 이렇게 안 하고 j<i로 하면
            }                                   // 처음에 0<0 이라 j for문은 안 돌아가서
            System.out.println();               // 여기 줄바꿈 코드만 출력 됨
        }

        /*
         *****
         ****
         ***
         **
         *
         */
        System.out.println("------------------");
        // 0, 5 0일 때 5번 찍는거니까
        // 1, 4
        // 2, 3
        // 3, 2
        // 4, 1 이니까
        // j < 5 - i 로 해도 되는데 이러면 int j=0; ;j++ 로

        for (int i = 0; i < 5; i++) {       // j 가 5 4 3 2 1 0 으로 떨어지고
            for (int j = 5; j > i; j--) {   // i 가 0 1 2 3 4 로 올라가는데
                System.out.print("*");      // 5>0(5 4 3 2 1 -> 5번)
            }                               // 5>1(5 4 3 2   -> 4번)
            System.out.println();           // 그래서 j > i 로 해주면 됨
        }

        /*
        *****
        ****#
        ***##
        **###
        *####
        #####
         */
        System.out.println("------------------");
        for (int i = 0; i < 6; i++) {           // i : 0 1 2 3 4 5
            for (int j = 6; j > i + 1; j--) {   // j : 6 5 4 3 2 1
                System.out.print("*");          // k : 0 1 2 3 4 5
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // 얘 같은 경우는 *이 줄어들고 #이 생기기 때문에
        // for > for > for 가 아니라
        // for > for + for 로 해줘야하고
        // *은 하나씩 줄어들고 #은 하나씩 늘어나니까
        // j-- k++ 인데
        // 각각의 for문에서 변수 다시 설정해주니까 둘 다 j로 써도 상관은 없고
        // 헷갈리니까 j랑 k로 써준거고

        // i랑 k를 보면 처음에는 안 나와야 하니까
        // 처음에 k=0<i=0 이라서 출력 X -> k < i 가 맞고

        // i랑 j를 보면 마지막에 안 나와야 하니까
        // 마지막에 j=6>j=7 이라서 출력 X -> j>i+1 가 맞고

        // @formatter:off
        /*
         //     *
         //    **
         //   ***
         //  ****
         // *****
         */
        // 공백 없게 다시
        System.out.println("------------------");
        for(int i = 0; i < 5; i++) {
            for(int j = 5; j > i+1; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         // *****
         //  ****
         //   ***
         //    **
         //     *
         */
        // 공백 없게 다시
        System.out.println("------------------");
        for(int i = 0; i < 5; i++) {
            for(int k = 0; k < i+1; k++) {
                System.out.print(" ");
            }
            for(int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        0
        01
        012
        0123
        01234
         */
        // num말고 걍 j넣으면 되자나여 신유망
        System.out.println("------------------");
        for(int i = 0; i < 5; i++) {
            int num=0;
            for(int j = 0; j < i+1; j++, num++) {
                System.out.print(num);
            }
            System.out.println();
        }

        /*
        1
        12
        123
        1234
        12345
         */
        System.out.println("------------------");
        for(int i = 0; i < 5; i++) {
            int num=1;
            for(int j = 0; j < i+1; j++, num++) {
                System.out.print(num);
            }
            System.out.println();
        }

        /*
        0
        12
        345
        6789
        01234
         */
        // 여기는 num같이 변수 세워주는 게 맞는 듯
        System.out.println("------------------");
        int num=0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i+1; j++, num++) {
                if (num == 10) num = 0;
                System.out.print(num);
            }
            System.out.println();
        }

        /*
        1
        23
        456
        7890
        12345
         */
        System.out.println("------------------");
        int Num=1;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i+1; j++, Num++) {
                if (Num == 10) Num = 0;
                System.out.print(Num);
            }
            System.out.println();
        }

        // @formatter:on


    }
}
