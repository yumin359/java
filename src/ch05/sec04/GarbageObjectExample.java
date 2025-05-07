package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // 얘는 쓰레기 값이 됨

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null; // 얘는 kind2에서 값을 가져다 쓸 수 있어서 아직은 쓰레기 값 아님
        System.out.println("kind2 = " + kind2);
    }
}
