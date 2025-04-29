package ch02.lecture;

public class C14Casting {
    public static void main(String[] args) {
        // 타입 변환
        // 작은 타입의 변수값을 큰 타입에 옮겨 담는 것은 항상 가능

        byte a = 3; // 1byte
        short b = 100;// 2bytes
        int c = 200;// 4bytes
        long d = 300L;// 8bytes

        b = a;// ok
        c = a;// ok
        d = a;// ok

        c = b;// ok
        d = b;// ok

        d = c;// ok

        // 정수형(byte, short, int, long)의 값을
        // 실수형(float, double)에 옮겨 담는 것 가능(문제없음)

        byte e = 3;     // 1byte
        short f = 4;    // 2bytes
        int g = 9;      // 4bytes
        long h = 10L;   // 8bytes

        float i;
        double j;

        // 다 ok
        i = e;
        i = f;
        i = g;
        i = h;

        // 다 ok
        j = e;
        j = f;
        j = g;
        j = h;

        // 작은 타입에서 큰 타입으로 옮기기 가능(문제없음)
        float k = 3.14F; // 4 bytes
        double l = 3.14; // 8 bytes

        l = k; // ok

        // char는 int와 long에 옮기기 가능, short는 불가능
        char m = '가';
        int n = m;
        long o = m;

//        short p = m ; // char는 음수 개념이 없어서 그렇다옹

    }
}
