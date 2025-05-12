package ch07.lecture.p04cast;

public class App05 {
    public static void main(String[] args) {
        // 확인하고 강제형변환(type casting)

        // instanceof 연산자 : 형변환 가능한 type인지 확인하는 연산자
        // 왼쪽항(참조변수), 오른쪽항(타입)
        // 결과 boolean

        Parent05 a = new Child051();
//        Parent05 a = new Parent05(); // 이러면 상위클래스 그대로 받는거라 형변환 본인 말고는 다 안됨~
        System.out.println(a instanceof Child051); // true
        System.out.println(a instanceof Parent05); // true
        System.out.println(a instanceof Child052); // false -> 051 052이니까

        // 형변환 가능한지 확인하고 강제형변환 해야함
        if (a instanceof Child051) {
            System.out.println("형변환가능");
            Child051 b = (Child051) a; // ok
        }
        // 형변환 가능한지 확인하고 강제형변환 해야함
        if (a instanceof Child052) {
            System.out.println("형변환가능2");
            Child052 c = (Child052) a; // 안되겠져
        }

        // 형변환 가능한지 확인하고 강제형변환 코드
        if (a instanceof Child051 d) {
            System.out.println("확인하고 형변환 됨3");
            System.out.println(d);
        }

        if (a instanceof Child052) {
            System.out.println("확인하고 형변환 됨4");
            Child052 e = (Child052) a;
            System.out.println(e);
        }
        // 위아래 같은 코드
        if (a instanceof Child052 e) {
            System.out.println("확인하고 형변환 됨4");
            System.out.println(e);
        }

        System.out.println("프로그램 종료");
    }
}

class Parent05 {
}

class Child051 extends Parent05 {
}

class Child052 extends Parent05 {
}