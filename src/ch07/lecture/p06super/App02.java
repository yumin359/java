package ch07.lecture.p06super;

public class App02 {
    public static void main(String[] args) {
        Child021 a = new Child021();
    }
}

class Parent02 {
    // private field

    public Parent02() {
        // 부모 클래스 생성자가 하는 일
        // field 초기화
        System.out.println("부모 클래스 필드 초기화");
    }
}

class Child021 extends Parent02 {
    public Child021() {
        // 부모 클래스의 생성자 호출 코드 꼭 있어야 함.
        // 왜냐하면 자식클래스에서는 부모클래스의 필드를 초기화할 수 없기때문이지요? -> 그래서 super()가 필요하대요
        // 작성하지 않으면 부모의 no-args 생성자 호출 코드 삽입
        // 진짜 뭔말인지 모르겠긴 하네용
        // 아무튼 안 중요하대요 ~ 잊어버리래요
//        super(); // 자동으로 생성된대여..

        // 자식 클래스 생성자가 하는 일
        System.out.println("자식 클래스 필드 초기화");
    }
}