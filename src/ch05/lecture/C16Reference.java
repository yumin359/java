package ch05.lecture;

import java.util.Arrays;

public class C16Reference {
    public static void main(String[] args) {
        // 1차원 배열
        // 참조값 복사
        int[] a = {7, 5};
        int[] b = a;
        a[0] = 77;
        System.out.println(Arrays.toString(a)); // 77 5
        System.out.println(Arrays.toString(b)); // 77 5

        // 배열 복사
        int[] c = {9, 2};
        int[] d = {c[0], c[1]}; // c[0]=9라는 값이 복사된거니까
        c[0] = 99; // 얘가 바껴도 d의 값이 바뀌는 게 아님
        System.out.println(Arrays.toString(c)); // 99 2
        System.out.println(Arrays.toString(d)); // 9 2

        // 2차원 배열
        // 참조값 복사
        int[][] e = {{8, 5}, {10, 20}};
        int[][] f = e;
        e[0][0] = 88;
        System.out.println(Arrays.toString(e[0])); // 88 5
        System.out.println(Arrays.toString(f[0])); // 88 5

        // 배열 복사
        int[][] g = {{5, 1}, {6, 8}};
        int[][] h = {g[0], g[1]}; // 값이 아니라 g[0]={5,1}의 참조값을 가져온거
        g[0][0] = 55;
        System.out.println(Arrays.toString(g[0])); // 55 1
        System.out.println(Arrays.toString(h[0])); // 55 1

    }
}
