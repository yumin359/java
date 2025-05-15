package ch16.sec05.exam01;

import static ch16.sec05.exam01.Computer.staticMethod;
// 저기 밑에

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();


        person.action((x, y) -> Computer.staticMethod(x, y));
        person.action((x, y) -> staticMethod(x, y));
        // 이거 위에 되게 하려고 생긴 것
        person.action(Computer::staticMethod);

        Computer com = new Computer();

        person.action((x, y) -> com.instanceMethod(x, y));
        person.action(com::instanceMethod);
    }
}
