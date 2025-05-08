package ch06.sec07.exam02;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean(String name, String s) {
        this.name = name; // 가려지니까 이렇게 해주는거
        ssn = s; // 얘는 변수명 달라서 안 가려져서 그냥 써도 됨.
    }
}
