package ch05.exercise;

public class Exercise07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int B = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                B = array[i];
            }
        }
        System.out.println(B);

        /*
        // 선생님이 하신 거
        int[] array = {1, 5, 3, 8, 2};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        // sort
        System.out.println("sort ------");
        Arrays.sort(array);
        System.out.println("array[array.length - 1] = " + array[array.length - 1]);
         */
    }
}

