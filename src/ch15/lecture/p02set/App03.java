package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class App03 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("java"); // 저장 X
        System.out.println(set);

        System.out.println();
        Book03 b1 = new Book03("java", 3000);
        Book03 b2 = new Book03("git", 4000);
        Book03 b3 = new Book03("java", 3000);

        Set<Book03> set2 = new HashSet<>();
        boolean r1 = set2.add(b1);
        boolean r2 = set2.add(b2);
        boolean r3 = set2.add(b3); // 안 들어감
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3); // 안 들어감
        set2.forEach(System.out::println);
        // equals랑 hashcode 재정의하면 안들어감
    }
}

class Book03 {
    private String title;
    private Integer price;

    public Book03(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book03{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book03 book03 = (Book03) o;
        return Objects.equals(title, book03.title) && Objects.equals(price, book03.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}