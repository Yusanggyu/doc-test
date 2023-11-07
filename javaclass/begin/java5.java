import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        System.out.printf("양의 정수 10개를 입력하세요>> ");
        int[] b = new int[10];
        boolean[] check = new boolean[10];
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            b[i] = a.nextInt();
            if (b[i] % 3 == 0) check[i] = true;
        }
        System.out.printf("3의 배수는 ");
        for (int i = 0; i < 10; i++) {
            if (check[i] == true) {
                System.out.printf("%d ",b[i]);
            }
        }
    }
}