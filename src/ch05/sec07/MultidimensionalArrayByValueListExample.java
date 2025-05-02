package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };
        System.out.println("반의수 = " + scores.length);
        System.out.println("1반의 학생수 = " + scores[0].length);
        System.out.println("2반의 학생수 = " + scores[1].length);

        System.out.println("1반의 3번 학생 점수 = " + scores[0][2]);
        System.out.println("2반의 2번 학생 점수 = " + scores[1][1]);


        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("1반 평균점수 = " + class1Avg);


        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("2반 평균점수 = " + class2Avg);


        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                totalSum += scores[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("모든 반 평균 = " + totalAvg);

    }
}
