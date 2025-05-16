package ch12.lecture.p05wrapper;

public class App04 {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        System.out.println("b1.getTitle() = " + b1.getTitle()); // null
        System.out.println("b1.getPrice() = " + b1.getPrice()); // 0

        System.out.println();

        Book2 b2 = new Book2();
        System.out.println("b2.getTitle() = " + b2.getTitle()); // null
        System.out.println("b2.getPrice() = " + b2.getPrice()); // null
    }
}

class Book2 {
    private String title;
    private Integer price; // 참조타입
    // 강사님은 이렇게 주로 쓰신대여 값이 결정 안 되어 있다는 의미가 있기 때문
    // 기본타입으로 쓰면 0원이라는 의미로 해석될 수 있기 때문에!

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

class Book1 {
    private String title;
    private int price; // 기본타입

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}