package ch05.lecture;

public class C23String {
    public static void main(String[] args) {

        // String 만드는 다양한 방법

        // 생성자 사용
        String a = "java"; // literal
        String b = new String("java"); // new
        System.out.println(a.equals(b)); // T

        // char 배열
        char[] c1 = {'j', 'a', 'v', 'a'};
        String c = new String(c1);
        System.out.println(a.equals(c)); // T
        char[] d1 = {'r', 'e', 'j', 'a', 'v', 'a', 't'};
        String d = new String(d1, 2, 4); // 2번 인덱스부터 4개
        System.out.println(a.equals(d)); // T

        // int 배열
        int[] e1 = {101, 106, 97, 118, 97, 99};
        String e = new String(e1, 1, 4);
        System.out.println(a.equals(e)); // T

        // byte 배열
        byte[] f1 = {106, 97, 118, 97};
        String f = new String(f1);
        System.out.println(a.equals(f)); // T
        byte[] g1 = {101, 106, 97, 118, 97, 99};
        String g = new String(g1, 1, 4);
        System.out.println(a.equals(g)); // T
    }
}
