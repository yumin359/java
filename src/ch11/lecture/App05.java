package ch11.lecture;

public class App05 {
    public static void main(String[] args) {

        try {
            int[] arr = {5, 0};
            // IndexOutOfBoundsException
            // ArithmeticException
//            int r = arr[0] / arr[1]; // Arith~~
//            int r = arr[2] / arr[1]; // Index~
            int r = arr[1] / arr[1]; // 어떤 catch도 거치지 않음
            System.out.println("다음 코드.");
        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("배열의 인덱스 참조 잘못되었을 때");
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("0으로 나눌 때");
        }

        System.out.println("나머지 코드들 .. .");
    }
}
