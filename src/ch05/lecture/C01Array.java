package ch05.lecture;

public class C01Array {
    public static void main(String[] args) {
        // 배열 (array) : 여러 값을 담을 수 있는 자료형(data type)

        // 기본타입
        int a;
        a = 3; // 하나의 값만 담을 수 있음

        // 배열
        int[] b;
        b = new int[5]; // 여러개의 값을 담을 수 있음

        // b는 5개의 int 값을 담을 수 있음
        b[0] = 9;   // b의 0번 index에 9라는 값 대입
        b[1] = 8;   // b의 1번 index에 8라는 값 대입
        b[2] = 7;   // b의 2번 index에 7라는 값 대입
        b[3] = 77;
        b[4] = 1234;
//        b[5] = 987; // 존재하지 않는 index 사용시 오류(Exception)
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);

        // 3개의 int 값을 담을 수 있는 배열 c를 만들어보세요.
        int[] c = new int[3];

        // c의 각 index에 값을 담아보세요
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;

        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);

        //
        double[] d;
        d = new double[3];

        d[0] = 3.11;
        d[1] = 3.33;
        d[2] = 3.55;
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d);

        //
        String[] e;
        e = new String[3];
        e[0] = "hi";
        e[1] = "hello";
        e[2] = "hi hello";
        System.out.println("e[0] = " + e[0]);
        System.out.println("e[1] = " + e[1]);
        System.out.println("e[2] = " + e[2]);
    }
}
