package ch13.exercise.p02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> c1 = new Container<>();
        c1.set("홍길동");
        String str = c1.get();
        System.out.println("str = " + str);

        Container<Integer> c2 = new Container<>();
        c2.set(6);
        int value = c2.get();
        System.out.println("value = " + value);
    }
}

class Container<T> {
    private T i;

    public T get() {
        return i;
    }

    public void set(T i) {
        this.i = i;
    }
}
