package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"국어", "영어", "수학"};
        double average;

        System.out.print("학생수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        int[][] score = new int[studentCount][subjects.length];

        for (int i = 0; i < score.length; i++) {
            System.out.println(i + 1 + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            average = (double) sum / score[i].length;
            System.out.print(i + 1 + "번 학생의 총점: " + sum);
            System.out.println(", 평균: " + average);
        }
    }
}
