package ch04.lecture;

public class C12while {
    public static void main(String[] args) {
        // while
        // () 조건이 true이면 코드블럭 실행
        //    후 다시 조건 확인을 이어감


        System.out.println("code 1");

        int i = 0;
        while (i < 5) {
            System.out.println("code 2");
            System.out.println("code 3");

            i++;
        }

        System.out.println("code 4");
        System.out.println("code 5");

    }
}
