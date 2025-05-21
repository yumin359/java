package ch15.lecture.p06etc;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class App05 {
    public static void main(String[] args) {
        // natural ordering이 결정 안 된 객체는
        // TreeSet 생성시 Comparator로 순서를 결정해 줄 수 있음
        // 가격순
//        Set<Book05> set = new TreeSet<>((a, b) -> a.getPrice() - b.getPrice());
        // 제목순
        Set<Book05> set = new TreeSet<>((a, b) -> a.getTitle().compareTo(b.getTitle()));

        set.add(new Book05("java", 3000));
        set.add(new Book05("git", 4000));
        set.add(new Book05("spring", 2000));
        set.forEach(System.out::println);
    }
}

class Book05 {
    private String title;
    private Integer price;

    public Book05(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book05 book05 = (Book05) o;
        return Objects.equals(title, book05.title) && Objects.equals(price, book05.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Book05{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}