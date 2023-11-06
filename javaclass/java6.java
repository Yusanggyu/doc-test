import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] unit = {50000,10000,1000,500,100,50,10,5,1};
        System.out.printf("금액을 입력하시오>> ");
        int b = a.nextInt();
        for (int i = 0; i < 9; i++) {
            if (b / unit[i] > 0) {
            System.out.printf("%d짜리 %d개\n",unit[i],b/unit[i]);
            b %= unit[i];
            }
        }
    }
}