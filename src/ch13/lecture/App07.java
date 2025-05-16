package ch13.lecture;

public class App07 {
    public static void main(String[] args) {
        Box07<Number> b1 = new Box07<>();
        b1.setItem(3.14);
        b1.setItem(99);

        //
        Integer b = 3;
        Number a = b;

        Box07<Integer> b3 = new Box07();
        // 안됨 왜냐면 double이 integer 일 수 없자나
//        Box07<Number> b2 = b3; // X
//        b2.setItem(88);
//        b2.setItem(3.14);

        // ? : wildcard
        Box07<Integer> b5 = new Box07<Integer>();
        Box07<Double> b6 = new Box07<Double>();
        Box07<Number> b7 = new Box07<Number>();
        Box07<Object> b8 = new Box07<>();
        Box07<? extends Number> b4 = b5;
        // b4의 타입파라미터는 Number를 상속받아서
        // Integer, Double, Number가 되는 거
        b4 = b6;
        b4 = b7;
//        b4 = b8; // X

        // Number 타입으로 안전하게 꺼낼 수 있음(get)
        // (box입장에서는 produce(생산))
        Number item = b4.getItem();
        item.intValue();
        item.doubleValue();

        Box07<Number> b10 = new Box07<>();
        Box07<Object> b11 = new Box07<>();
        Box07<? super Number> b9;
        // b9의 타입파라미터는 Number타입의 상위타입으로 선언되어서
        // Number Object
        b9 = b10;
        b9 = b11;

        // 안전하게 set 할 수 있음
        // (box 입장에서는 consume)
        b9.setItem(9);
        b9.setItem(3.14);

        // produce면 extends -> get
        // consume이면 super -> set
        // pecs

        // ?
        Box07<Object> b13 = new Box07<>();
        Box07<Number> b14 = new Box07<>();
        Box07<Integer> b15 = new Box07<>();
        Box07<Double> b16 = new Box07<>();
        Box07<Boolean> b17 = new Box07<>();
        Box07<?> b12;
        b12 = b13;
        b12 = b14;
        b12 = b15;
        b12 = b16;
        b12 = b17;


        // 그치만 웬만해서 인텔리제이가 다 오류 잡아주니 적당히 보고 넘어가면된다!
    }
}

class Box07<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}