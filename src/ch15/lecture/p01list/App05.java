package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App05 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");
        list1.add("react");

        List<String> list2 = list1;
        list2.set(0, "python");
        System.out.println("list2 = " + list2);
        System.out.println("list1 = " + list1);

        List<List<String>> list3 = new ArrayList<>();
        List<String> r1 = new ArrayList<>();
        r1.add("hello");
        r1.add("java");

        list3.add(r1);

        List<String> r2 = new ArrayList<>();
        r2.add("hi");
        r2.add("python");

        list3.add(r2);

        System.out.println(list3);

        List<List<String>> list4 = list3;
        list4.get(0).set(0, "hola");
        System.out.println("list4 = " + list4);
        System.out.println("list3 = " + list3);

        List<List<String>> list5 = new ArrayList<>();
        list5.add(list3.get(0));
        list5.add(list3.get(1));
        System.out.println("list5 = " + list5);
        list5.get(0).set(1, "react");
        System.out.println("list5 = " + list5);
        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);

        // 내가 따로 한 거
        List<List<String>> list6 = new ArrayList<>();
        List<String> l6 = new ArrayList<>();
        l6.add(list3.get(0).get(0));
        l6.add(list3.get(0).get(1));
        list6.add(l6);
        System.out.println("list6 = " + list6);
        list6.get(0).set(0, "lll");
        System.out.println("list6 = " + list6);
        System.out.println("list5 = " + list5);
        System.out.println("list4 = " + list4);
        System.out.println("list3 = " + list3);

    }
}
