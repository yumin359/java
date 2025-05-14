package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        Service s = new ServiceImpl();

        s.defaultMethod1();
        System.out.println();
        s.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
