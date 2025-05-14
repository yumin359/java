package ch16.sec01;

@FunctionalInterface
public interface Calculable {
    // field, static method, private static method, default method, private method
    // 위에는 들어가도 됨. 아래의 추상 메소드만 하나이면 됨
    void calculate(int x, int y);
}
