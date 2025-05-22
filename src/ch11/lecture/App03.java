package ch11.lecture;

public class App03 {
    public static void main(String[] args) {

        try {
            int[] arr = {3, 4};
            System.out.println(arr[2]);

            System.out.println("프로그램 진행");
        } catch (IndexOutOfBoundsException e) {
            // 관련된 메소드들이 있구낭..~ 정도로 알아라
            String message = e.getMessage(); // 오류 메세지
            System.out.println("message = " + message);
            Throwable cause = e.getCause(); // 오류가 일어난 이유
            System.out.println("cause = " + cause);
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement);
            } // 오류가 일어난 위치
            // try catch문을 쓰면 오류메시지가 콘솔창에 안 뜨기 때문에
            // 오류가 안 났다고 생각할 수도 있음
            // 위에서는 각각 출력한거고 얘를 한번에 출력할 수있는게 있음


            System.out.println("예외 발생시 실행되는 코드");
        }

        System.out.println("나머지 코드들 ... ");

    }
}
