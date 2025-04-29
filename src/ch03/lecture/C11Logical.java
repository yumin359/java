package ch03.lecture;

public class C11Logical {
    public static void main(String[] args) {
        // 논리연산자
        // and &&, &
        // or ||, |

        // 피연산자는 boolean
        // 연산결과는 boolean
        // 1이나 0으로 쓰면 안 돼용
        // boolean만!! 써야돼용

        // and &&, &
        // : 두 피연산자가 true일 때만 결과 true, 나머지 결과 fasle
        System.out.println("(true && true) = " + (true && true)); // 얘만 true
        System.out.println("(true && false) = " + (true && false));
        System.out.println("(false && true) = " + (false && true));
        System.out.println("(false && false) = " + (false && false));

        System.out.println("(true & true) = " + (true & true)); // 얘만 true
        System.out.println("(true & false) = " + (true & false));
        System.out.println("(false & true) = " + (false & true));
        System.out.println("(false & false) = " + (false & false));

//        System.out.println("(0 && true) = " + (0 && true)); // X
//        System.out.println("(0 & true) = " + (0 & true)); // X
//        System.out.println("(0 & 1) = " + (0 & 1)); // 비트연산 -> 강사님은 안 하실거에여

        // or ||, |
        // : 두 피연산자가 false일 때만 결과 false, 나머지 결과 true
        System.out.println("(true || true) = " + (true || true));
        System.out.println("(true || false) = " + (true || false));
        System.out.println("(false || true) = " + (false || true));
        System.out.println("(false || false) = " + (false || false)); // 얘만 false

        System.out.println("(true | true) = " + (true | true));
        System.out.println("(true | false) = " + (true | false));
        System.out.println("(false | true) = " + (false | true));
        System.out.println("(false | false) = " + (false | false)); // 얘만 false

        // 연습
        int x = 5;
        int y = 8;
        boolean r1 = (x > 5) && (y < 5);
        System.out.println("r1 = " + r1);// F
        boolean r2 = (x > 5) || (y < 5);
        System.out.println("r2 = " + r2);// F
    }
}
