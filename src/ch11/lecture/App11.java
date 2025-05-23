package ch11.lecture;

public class App11 {
    public static void main(String[] args) {


        try {
            Class.forName("java.lang.String2");
            System.out.println("code.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("code~~~~~");
    }
}
