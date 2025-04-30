package ch04.lecture;

public class C04Nested {
    public static void main(String[] args) {

        if (false) {
            if (false) {
                System.out.println("code 1");
            } else {
                System.out.println("code 2");
            }
        } else {
            if (true) {
                System.out.println("code 3");
            } else {
                System.out.println("code 4");
            }
        }

    }
}
