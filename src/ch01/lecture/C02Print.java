package ch01.lecture;

public class C02Print {
    public static void main(String[] args){
        // 출력
        System.out.println("출력 메시지");

        // sout enter : System.out.println
        System.out.println("또 다른 출력");

        // shift enter : 다음 줄에 작성
        System.out.println("또또 출력");

        // print : 끝에 다음 줄 없음
        System.out.print("또 다른 출력");
        System.out.print("또또 출력");
        System.out.println("끝에 엔터 있음");
        System.out.println("끝에 엔터 또 있음");

        // printf : 특정 위치에 값 포함 출력
        System.out.printf("hello");
        System.out.printf("hello2");
        System.out.printf("hello3\n");
        System.out.printf("hello4\n");
        System.out.printf("값%s값%s\n", "a", "b");
        System.out.printf("12345678901234567890\n");
        // %숫자s : 숫자만큼 자리 차지
        System.out.printf("%5s%3s\n", "12", "34");
        // %-숫자s : 숫자만큼 자리 차지 (왼쪽 정렬)
        System.out.printf("%-5s%-3s\n", "12", "34");
        // %d : 정수형 출력
        System.out.printf("%s%d\n", "hi", 987);
        // %f : 실수형 출력
        System.out.printf("%s%d%f\n", "hello", 99, 3.14);
        // %10.3 : 총 10자리, 소수점이하 3자리
        System.out.printf("%10.3f\n", 3.14);


        // \n : 다음 줄(enter)
        System.out.print("\n");
        System.out.println("java\n안녕");
    }
}
