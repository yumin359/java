package ch13.lecture;

public class App01 {
    public static void main(String[] args) {
        Box01 b = new Box01();
//        b.setItem(99);
//        Integer v = b.getItem();
//        System.out.println("v = " + v);

        b.setItem(3.14); //


    }
}

class Box01 {
    private Double item;

    public Double getItem() {
        return item;
    }

    public void setItem(Double item) {
        this.item = item;
    }
}
