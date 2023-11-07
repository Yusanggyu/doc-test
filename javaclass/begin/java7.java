import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String course [] = {"자바", "C", "HTML5","PYTHON"};
        int score [] = {95, 88, 76, 62};
        boolean check = false;
        while (true) {
            System.out.print("과목 이름 >> ");
            String b = a.next();
            for (int i = 0; i < 4; i++) {
            if (b.equals(course[i])) System.out.printf("%s의 점수는 %d점",course[i],score[i]); check = true;
            }
            if (b.equals("그만")) break;
            else if (check == false) System.out.println("없는 과목입니다.");
            }
}
}