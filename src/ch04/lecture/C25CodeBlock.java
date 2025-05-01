package ch04.lecture;

public class C25CodeBlock {
    public static void main(String[] args) {
        if (true) {
            // 코드블럭 {} 내의 코드들은 오른쪽 들여쓰기 해야함
            // 꼭!!


        } else if (true) System.out.println();
            // 코드블럭 내의 코드가 한 줄이면
            // {} 생략 가능
            // 하지만 생략하지 말 것
        else
            System.out.println();
        System.out.println();

        for (int i = 0; i < 3; i++) {

        }
        while (true) {
            break;
        }

        for (int i = 0; i < 3; i++)
            System.out.println("hi");
        

    }
}
