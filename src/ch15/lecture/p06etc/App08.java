package ch15.lecture.p06etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App08 {
    public static void main(String[] args) {
        // List.of, Set.of, Map.of : unmodifiable 콜렉션 생성
        List<Integer> list1 = List.of(100, 500, 50);
        // 추가, 변경, 삭제, 정렬 등 안 됨
//        list1.remove(0);
//        list1.set(0, 1);
//        list1.add(700);
//        Collections.sort(list1);

        // 수정하고 싶으면 이렇게 새로운 거 만들어서 값 넣어서 수정해줘야함.
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        list2.remove(0);
        list2.set(0, 1);
        list2.add(700);
        Collections.sort(list2);
        System.out.println(list2);


    }
}
