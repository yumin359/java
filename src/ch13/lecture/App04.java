package ch13.lecture;

public class App04 {
    public static void main(String[] args) {
        Box04<Integer> b1 = new Box04<Integer>(); // 뒤에 <>안에 값은 생략가능
        b1.setItem(99);
//        b1.setItem(3.14); // X
        Integer item1 = b1.getItem();
        System.out.println("item1 = " + item1);

        Box04<Double> b2 = new Box04<Double>();
//        b2.setItem(99);
        b2.setItem(3.14);
        Double item2 = b2.getItem();
        System.out.println("item2 = " + item2);

        Box04<String> b3 = new Box04<String>();
//        b2.setItem(99);
        b3.setItem("java");
        String item3 = b3.getItem();
        System.out.println("item3 = " + item3);
        String u = item3.toUpperCase();
        System.out.println("u = " + u);
    }
}

// generic type : 아직 결정되지 않은 타입
// <T> : 타입 파라미터, T 말고 다른 거 써도 되는데 관습상 T 쓴대여
class Box04<T> { // 나중에 받아서 결정하겠다
    // T는 Integer, Double, Number, String, Object 중에서 결정됨
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}