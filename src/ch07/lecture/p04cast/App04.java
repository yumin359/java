package ch07.lecture.p04cast;

public class App04 {
    public static void main(String[] args) {
        SubClass041 a = new SubClass041();
        // 자동형변환
        SuperClass04 b = a;

        // 강제형변환 가능
        SubClass041 c = (SubClass041) b;

        // 강제형변환 불가능
        SubClass042 d = (SubClass042) b; // 041이 042가 될 순 없으니 오류뜬당
        System.out.println("프로그램 종료"); // 컴파일은 되지만 얘는 출력안됨.
    }
}

class SuperClass04 {

}

class SubClass041 extends SuperClass04 {

}

class SubClass042 extends SuperClass04 {

}