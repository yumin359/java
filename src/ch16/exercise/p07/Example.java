package ch16.exercise.p07;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((a, b) -> a > b ? a : b);
        System.out.println("max = " + max);

        int min = maxOrMin((a, b) -> a < b ? a : b);
        System.out.println("min = " + min);
    }
}
