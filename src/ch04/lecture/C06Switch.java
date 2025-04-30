package ch04.lecture;

public class C06Switch {
    public static void main(String[] args) {
        // switch : 특정 변수의 값이 같은 부분부터 실행

        int v = 30;
        switch (v) {

            case 10:
                System.out.println("code 1");
                break; // 코드블럭 효과
            case 20:
                System.out.println("code 2");
                break;
            case 30:
                System.out.println("code 3");
                break;
            default:
                // 일치하는 case가 없을 때
                // 위치는 상관 없어요 근데 보통 맨 아래 해줌
                System.out.println("code 4");
                break; // 마지막 break;는 생략가능
        }
    }
}
