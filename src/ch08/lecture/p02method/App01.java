package ch08.lecture.p02method;

public class App01 {
    public static void main(String[] args) {
        // interface로 인스턴스 만들 수 없음
//        Beast1 a = new Beast1();
        Tiger1 t = new Tiger1();
        Wolf1 w = new Wolf1();

        Beast1 b = t;
        Beast1 c = w;
        b.hunt(); // Tiger.hunt();
        c.hunt(); // Wolf.hunt();
    }
}

interface Beast1 {

    // interface에 있는 method는 모~두 (사실 아닌것도 있음)
    // public abstract method -> 몸통이 있으면 안 됨.
    public void hunt();
}

class Tiger1 implements Beast1 {
    @Override
    public void hunt() {
        System.out.println("초식동물들을 사냥합니다.");
    }
}

class Wolf1 implements Beast1 {
    @Override
    public void hunt() {
        System.out.println("작은 동물들을 사냥합니다.");
    }
}
