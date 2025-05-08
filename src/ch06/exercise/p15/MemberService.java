package ch06.exercise.p15;

public class MemberService {
    // id password
    // login

    // id
    // logout

    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else { // 어차피 위에 돌아가면 return true 하고 메소드 종료되니까 else 없어도 되겠네
            return false;
        }
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

}
