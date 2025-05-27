package ch18.sec10;

import java.io.*;
import java.util.Arrays;

//
public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 1500000);
        int[] arr1 = {1, 2, 3};

        try (oos; fos) {

            oos.writeObject(m1);
            oos.writeObject(p1);
            oos.writeObject(arr1);

            oos.flush();
        }

        FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try (fis; ois) {
            Member m2 = (Member) ois.readObject();
            Product p2 = (Product) ois.readObject();
            int[] arr2 = (int[]) ois.readObject();

            System.out.println(m2);
            System.out.println(p2);
            System.out.println(Arrays.toString(arr2));
        }

    }
}
