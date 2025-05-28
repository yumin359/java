package ch21.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class VarExample2 {
    public static void main(String[] args) {
        method1(); // 키와 값의 타입을 정확히 알 수 있음
        method2(); // 코드가 훨씬 간결해지고 가독성이 좋아짐
        // var 남발하진 말고 타입으로 인한 복잡성이 증가될 때만 사용하는 것이 좋다
    }

    public static void method1() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }

    public static void method2() {
        var map = new HashMap<String, Integer>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);

        var entrySet = map.entrySet();
        var entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            var entry = entryIterator.next();
            var key = entry.getKey();
            var value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
