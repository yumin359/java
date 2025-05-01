package ch04.lecture;

public class C24Continue {
    public static void main(String[] args) {
        // continue;
        // 다음 코드들을 실행하지 않고, 반복문을 계속 진행
        // 다른 해결방법이 많아서 보통 안 쓰지만 가끔 생각나면 쓰는 정도

        for (int i = 0; i < 5; i++) {
            System.out.println(1);
            System.out.println(2);
            if (true) break;
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println("---continue---");
        for (int i = 0; i < 5; i++) {
            System.out.println(1);
            System.out.println(2);
            if (true) continue;
            System.out.println(3);
            System.out.println(4);
        }
    }
}
