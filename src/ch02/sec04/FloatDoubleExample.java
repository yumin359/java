package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 정밀도 확인
        // 저장공간 때문에 근사한 값으로 표시됨
        float var1 = 0.1234567890123456789F;
        double var2 = 0.1234567890123456789;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        // 10의 거듭제곱 리터럴
        double var3 = 3e6;
        double v32 = 3E6;
        double v31 = 3.0 * 1000000;
        // 세 개 같음

        float var4 = 3e6F;

        double var5 = 2e-3;
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
    }
}
