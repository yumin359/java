package ch03.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println("z = " + z); // 11 + 20 = 31
        // x = 11 , y = 19
    }
}
