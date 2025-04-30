package ch04.lecture;

public class C03ElseIf {
    public static void main(String[] args) {
        // else if : 이전 조건들이 false 일 때 조건을 확인해서 true면 실행되는 블럭

        if (false) {
            System.out.println("code 1");
        } else if (false) {
            System.out.println("code 2");
        } else if (false) {
            System.out.println("code 3");
        } else if (false) {
            System.out.println("code 4");
        } else {
            // 위의 조건들이 모두 false일 때
            // 해도 되고 안 해도 됨
            System.out.println("code 5");
        }
    }
}
