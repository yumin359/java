package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); // 중복 저장 X
        set.add("Spring");
        System.out.println(set);

        int size = set.size();
        System.out.println("size = " + size);
    }
}
