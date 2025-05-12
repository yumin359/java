package ch07.lecture.p05abstract;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;

public class App04 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        AbstractList b = a;
        AbstractCollection c = a;
        Object d = a;
        // 변수에 선언된 타입(왼쪽)이 아니라
        // 실제 객체 타입을 기준으로 검사한다
        // 타입이 4개나 있지만
        // 실제로 할당된 객체를 모두 new ArrayList()
        // 따라서 ArrayList가 가장 하위 클래스 이므로
        // 1234라고 하면
        // 4->4
        // 4->3
        // 4->2
        // 4->1
        // 이므로 모두 가능한 것임.

        System.out.println(a instanceof ArrayList); // T
        System.out.println(a instanceof AbstractList); // T
        System.out.println(a instanceof AbstractCollection); // T
        System.out.println(a instanceof Object); // T

        System.out.println(b instanceof ArrayList); // T
        System.out.println(b instanceof AbstractList); // T
        System.out.println(b instanceof AbstractCollection); // T
        System.out.println(b instanceof Object); // T

        System.out.println(c instanceof ArrayList); // T
        System.out.println(c instanceof AbstractList); // T
        System.out.println(c instanceof AbstractCollection); // T
        System.out.println(c instanceof Object); // T

        System.out.println(d instanceof ArrayList); // T
        System.out.println(d instanceof AbstractList); // T
        System.out.println(d instanceof AbstractCollection); // T
        System.out.println(d instanceof Object); // T

        // 자동형변환이 일어나고
        // 실제인스턴스가 실행된다
    }
}
