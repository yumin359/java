package ch07.exercise.p11;

public class App {
    public static void main(String[] args) {
        Activity a = new Activity();
        a.onCreate();

        MainActivity b = new MainActivity();
        b.onCreate();

        Activity c = new MainActivity();
        c.onCreate();
    }
}
