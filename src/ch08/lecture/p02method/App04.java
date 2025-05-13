package ch08.lecture.p02method;

public class App04 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.walk();
        hero.pickWeapon(new Sword());
        hero.attack();
        System.out.println();
        hero.walk();
        hero.pickWeapon(new Gun());
        hero.attack();
        System.out.println();
        hero.walk();
        hero.pickWeapon(new Bow());
        hero.attack();
    }
}

// Weapon 이라는 이름의 인터페이스를 정의
interface Weapon {
    void use();
}
// "모든 무기는 use()라는 동작을 가져야 한다"는 규약을 정의
// , 실제 동작은 각 무기 클래스에서 구현하게 됩니다.

class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("칼을 휘두릅니다.");
    }
}

class Gun implements Weapon {
    @Override
    public void use() {
        System.out.println("총을 쏩니다.");
    }
}

class Bow implements Weapon {
    @Override
    public void use() {
        System.out.println("활을 쏩니다.");
    }
}

class Hero {
    private Weapon weapon;
    // Weapon 이라는 이름의 클래스나 인터페이스 타입의 객체를 참조하고,
    // weapon 이라는 변수명을 사용

    public void walk() {
        System.out.println("걸어갑니다.");
    }

    public void pickWeapon(Weapon weapon) {
        System.out.println("무기를 획득합니다.");
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("공격합니다.");
        weapon.use();
    }
}