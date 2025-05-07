package ch05.lecture;

import java.util.Arrays;

public class C21Garbage {
    public static void main(String[] args) {
        int[] a = new int[]{5, 6};
        int[] b = new int[]{10, 20}; // 참조값이 c1b2라 하고

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b = new int[]{100, 200};    // 참조값이 9e8d라고 하면
        // 여기서 b의 참조값이 c1b2 -> 9e8d로 바뀜
        // 그렇게 되면 c1b2는 쓰레기값(Garbage)이 됨. 쓸 수도 없는데 메모리만 차지하는 값이 된 거
        // 이때 쓰레기 수집기(Garbage Collector)가 자동으로 실행되어 쓰레기값을 없앤당.
        // 우리가 따로 하는 일은 없고 알아서 처리됨~ 그냥 Garbage Colletor(GC)가 있구나 알고 있음 된대여
        System.out.println(Arrays.toString(b));
    }
}
