package ch11.lecture;

public class App07 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};
            // ArithmeticException
            // IndexOutOfBoundsException
            int c = arr[0] / arr[1];
            System.out.println("c = " + c);
        } catch (Throwable e) { // 상위타입으로 받을 수 있당
            // 젤 상위인 Object는 안 된다옹
            // api에서 상속관계 확인 ㄱㄱ
            // 근데 보통 Exception 쓴대용
            System.out.println("예외 처리 코드");
        }
//      } catch (ArithmeticException | IndexOutOfBoundsException e) {
//            e.printStackTrace(); // 교육에선 길어서 주석처리해둔거
//            System.out.println("예외 처리 코드");
//      }
    }
}
