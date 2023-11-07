import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float std = 0;
        System.out.printf("5개의 정수를 입력하세요>> ");
        for (int i = 0; i < 5; i++) {
            int b = a.nextInt();
            std += b;
        }
        System.out.printf("평균은 %.1f",std/5);
    }
}