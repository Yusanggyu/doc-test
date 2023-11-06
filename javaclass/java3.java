import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        float cnt = 0;
        double[][] score = {{3.3,3.4}, {3.5,3.6}, {3.7,4.0}, {4.1,4.2}};
        for (int i = 0; i<4; i++) {
            for (int j = 0; j < 2; j++) {
                cnt += score[i][j];
            }
        }
        System.out.printf("4년 전체 평점 평균은 %.3f입니다", cnt / 8);
    }
}