package ch08.exercise.p6;

public class SoundableExample {
    public static void printSound(Soundable soundable) {
        // Soundable 이라는 이름을 가진 인터페이스 타입의 매개변수 soundable을 받아서
        // 그 객체의 sound() 메서드를 호출하고 결과 출력
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
