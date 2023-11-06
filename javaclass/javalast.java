import java.util.Scanner;

public class javalast {
    public static void main(String[] args) {
        float total = 0;
        int kort=0,matht=0,engt=0;
        Scanner a = new Scanner(System.in);
        System.out.println("천안오성고등학교 성적처리시스템 made 송이썜");
        System.out.printf("성적처리할 학생 수를 입력하시오. >> ");
        int student = a.nextInt();
        int[] kor = new int[student];
        int[] math = new int[student];
        int[] eng = new int[student];
        for (int j = 0; j < student; j++) {
            System.out.printf("%d번째 학생의 국어의 점수를 입력하세요. >> ",j+1);
            kor[j] = a.nextInt();
            System.out.printf("%d번째 학생의 수학의 점수를 입력하세요. >> ",j+1);
            math[j] = a.nextInt();
            System.out.printf("%d번째 학생의 영어의 점수를 입력하세요. >> ",j+1);
            eng[j] = a.nextInt();
        }
        System.out.println("번호\t국어\t수학\t영어\t총점\t평균");
        System.out.println("==============================================");
        for (int i = 0; i < student; i++) {
            total = kor[i]+math[i]+eng[i];
            kort += kor[i];
            matht += math[i];
            engt += eng[i];
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\n",i+1,kor[i],math[i],eng[i],total,total/3);
        }
        System.out.printf("총점\t%d\t%d\t%d\t%d\n",kort,matht,engt,kort+matht+engt);
        System.out.printf("평균\t%.1f\t%.1f\t%.1f",(float)(kort/student), (float)(matht/student),(float)(engt/student));
    }
}