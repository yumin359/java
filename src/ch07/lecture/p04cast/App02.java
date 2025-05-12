package ch07.lecture.p04cast;

public class App02 {
    public static void main(String[] args) {
        GuideDog02 a = new GuideDog02();
        a.bark();
        a.guide();

        Dog02 b = a;
        b.bark();
//        b.guide(); // X -> 개가 안내견이다 Dog02 is a GuideDog02 는 말이 안 됨.
    }
}

class Dog02 {
    public void bark() {
        System.out.println("멍멍");
    }
}

class GuideDog02 extends Dog02 {
    @Override
    public void bark() {
        System.out.println("왕왕");
    }

    public void guide() {
        System.out.println("길을 안내합니다.");
    }
}

class Chihuahua02 extends Dog02 {
    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}