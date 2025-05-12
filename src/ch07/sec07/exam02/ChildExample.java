package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1(); // 그대로 상속 받아 Parent-method1() 출력
        parent.method2(); // 재정의 해서 Child-method2() 출력
//        parent.method3(); // X parent에는 method3이 없어서 안 됩니더
    }
}
