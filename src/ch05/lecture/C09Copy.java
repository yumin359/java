package ch05.lecture;

public class C09Copy {
    public static void main(String[] args) {
        int[] a = {9, 7, 5, 3};
        int[] b = a;
        a[0] = 99;
        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);

        // 배열 복사
        int[] c = {5, 6, 1, 2};
        int[] d = new int[c.length];
        // 배열의 길이만 가져온거고, 두 배열은 서로 다른 참조값을 가짐
        // d = c; 하면 같은 참조값 같게되는거

        for (int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }

        System.out.println("---c 전체탐색---");
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }
        System.out.println("---d 전체탐색---");
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }

        c[0] = 55;
        System.out.println("---c 전체탐색---");
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }
        System.out.println("---d 전체탐색---");
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }
    }
}
