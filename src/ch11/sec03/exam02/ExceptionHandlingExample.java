package ch11.sec03.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("실행에 문제가 있습니다.");
            }
            /*
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (Exception e) {
            // 이렇게 하면 안 됨.-> 아래 catch블럭이 영원히 실행 안 됨!
            // 하위타입의 exception을 먼저 작성해줘야함
            // 그치만 인텔리제이가 알아서 오류 잡아주니 외울 필요는 없대용 ~
                System.out.println("실행에 문제가 있습니다.");
            }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
             */
        }

    }
}
