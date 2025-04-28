package ch02.lecture;

public class C12VariableName {
    public static void main(String[] args) {
        // 영문대소문자, $, _, 숫자
        // 숫자로 시작할 수 없음
        // 의미있는 이름으로
        // lowerCamelCase 사용
        // 예약어(키워드) 사용 불가

        int modelName; // ok (관습에 적합)
//        int class; // class가 예약어임
//        int 6hour; // 숫자로 시작할 수 없음
        int $value; // ok (관습에 부적합)
        int _age; // ok (관습에 부적합)
//        int #name; // # 사용불가
//        int int; // int가 예약어임

    }
}
