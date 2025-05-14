package ch16.exercise.p06;

@FunctionalInterface
public interface Function { // 추상메소드가 하나여야함 -> 메인문에 람다식으로 되어있기때문
    public double apply(double x, double y);
}
