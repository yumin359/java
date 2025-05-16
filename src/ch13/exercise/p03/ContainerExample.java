package ch13.exercise.p03;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> c1 = new Container<>();
        c1.set("hong", "도적");

        String key = c1.getKey();
        String value = c1.getValue();
        System.out.println("key = " + key);
        System.out.println("value = " + value);

        Container<String, Integer> c2 = new Container<>();
        c2.set("hong", 35);
        String key1 = c2.getKey();
        Integer value1 = c2.getValue();
        System.out.println("key1 = " + key1);
        System.out.println("value1 = " + value1);
    }
}
