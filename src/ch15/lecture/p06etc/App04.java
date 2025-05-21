package ch15.lecture.p06etc;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class App04 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("java");
        set1.add("css");
        set1.add("spring");
        System.out.println(set1);

        Set<Book04> set2 = new HashSet<>();
        set2.add(new Book04("java", 3000));
        set2.add(new Book04("git", 4000));
        set2.add(new Book04("spring", 2000));
        set2.add(new Book04("spring", 2000));

        set2.forEach(System.out::println);
        System.out.println();

        Set<Book04> set3 = new TreeSet<>();
        set3.add(new Book04("java", 3000));
        set3.add(new Book04("git", 4000));
        set3.add(new Book04("spring", 2000));
        set3.add(new Book04("spring", 2000));
        set3.add(new Book04("spring", 1000));

        set3.forEach(System.out::println);
    }
}

// natural ordering : Comparable 구현
class Book04 implements Comparable<Book04> {
    private String title;
    private Integer price;

    // 어떻게 정렬할건지 내가 정의해줘야함.
    @Override
    public int compareTo(Book04 o) {
        // 가격 순 정렬
//        return this.price - o.price;

        // 제목 순 정렬
//        return this.title.compareTo(o.title);

        // 같은 제목이면 가격으로 비교
        int t = this.title.compareTo(o.title);
        if (t == 0) {
            return this.price - o.price;
        } else {
            return t;
        }
    }

    public Book04(String title, Integer price) {
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
    public String toString() {
        return "Book04{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book04 book04 = (Book04) o;
        return Objects.equals(title, book04.title) && Objects.equals(price, book04.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}