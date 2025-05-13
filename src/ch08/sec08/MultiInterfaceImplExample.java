package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
//        rc.search(); // X

        Searchable searchable = new SmartTelevision();

        searchable.search("https://www.google.com");
    }
}
