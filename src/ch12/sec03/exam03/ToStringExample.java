package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone m = new SmartPhone("삼성전자", "안드로이드");

        String s = m.toString();
        System.out.println(s);

        System.out.println(m);
    }
}
