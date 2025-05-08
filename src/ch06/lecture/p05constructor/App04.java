package ch06.lecture.p05constructor;

public class App04 {
    public static void main(String[] args) {

    }
}

class MyClass42 {
    String name;
    String address;
    int age;
    boolean married;
    int num;

    public MyClass42(String name, String address, int age, boolean married, int num) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.married = married;
        this.num = num;
    }
}

class MyClass41 {
    String name;
    String address;
    int age;
    boolean married;

    // 우클릭 - generate - construct - 원하는 초기화 항목 선택 - enter
    // 단축키 : alt insert
    public MyClass41(String name, String address, int age, boolean married) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.married = married;
    }

}