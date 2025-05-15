package ch12.sec03.exam01;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    // Object equals() 메소드 재정의
    @Override
    public boolean equals(Object o) {
        if (o instanceof Member t) {
            if (id.equals(t.id)) {
                return true;
            }
        }
        return false;
    }

}
// 해시코드는 바구니 .. 정도로 생각
// .