package ch04.lecture;

public class C08SwitchExpression {
    public static void main(String[] args) {
        int a = 2;

        switch (a) {
            case 1:
                System.out.println("code!");
                System.out.println("code@");
                break;
            case 2:
                System.out.println("code#");
                System.out.println("code$");
                break;
            default:
                System.out.println("code%");
                System.out.println("code^");
        }

        // switch expression
        switch (a) {
            case 1 -> {
                System.out.println("code!");
                System.out.println("code@");
            }
            case 2 -> {
                System.out.println("code#");
                System.out.println("code$");
            }
            default -> {
                System.out.println("code%");
                System.out.println("code^");
            }
        }

        // old style
        switch (a) {
            case 1:
            case 2:
                System.out.println("code&");
            case 3:
            case 4:
                System.out.println("code*");
            default:
                System.out.println("code(");
        }

        // new style
        switch (a) {
            case 1, 2 -> {
                System.out.println("code&");
            }
            case 3, 4 -> {
                System.out.println("code*");
            }
            default -> {
                System.out.println("code(");
            }
        }

        // 코드블럭이 한줄이면 {} 생략 가능
        switch (a) {
            case 1, 2 -> System.out.println("code&");
            case 3, 4 -> System.out.println("code*");
            default -> System.out.println("code(");
        }

    }
}