package ch13.lecture;

public class App10 {
    public static void main(String[] args) {

    }
}

class MyClass10 {
    public <T extends String> void action(T param) {
        param.toUpperCase();
    }
}