package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        // p05wrapper.App02에 대한 교재 예시
        Integer o1 = 300;
        Integer o2 = 300;
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        int a = o1;
        int b = o2;
        System.out.println(a == b);

        Integer o3 = 10;
        Integer o4 = 10;
        System.out.println(o3 == o4);
        System.out.println(o3.equals(o4));
    }
}
