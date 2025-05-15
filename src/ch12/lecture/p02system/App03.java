package ch12.lecture.p02system;

public class App03 {
    public static void main(String[] args) {
        // nanoTime() : 프로그램 실행시간 측정을 위한 메소드
        // 현재시간과 관련 없움.
        long start = System.nanoTime();
        System.out.println("프로그램실행코드 ... ");
        long end = System.nanoTime();
        long result = end - start;
        System.out.println("result = " + result);
    }
}
