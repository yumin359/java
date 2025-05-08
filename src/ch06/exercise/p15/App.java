package ch06.exercise.p15;

public class App {
    public static void main(String[] args) {
        MemberService m = new MemberService();
        boolean result = m.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다.");
            m.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
