package ch02.lecture;

public class C06RealNumber {
    public static void main(String[] args) {
        // 실수 :
        // float (4bytes, 16bits)
        float a = 3.14F;
        System.out.println("a = " + a);

        // double (8bytes, 64bits)
        // 더 넓은 범위를 촘촘하게 표현함
        double b = 3.14;
        System.out.println("b = " + b);

        // java 코드에서 실수 literal은 double로 인식
        // java에서 실수 literal이 float로 표현하려면 끝에 F(f)
        // 웬만해선 double을 쓴대여
    }
}
