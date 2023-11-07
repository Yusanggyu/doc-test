import java.util.Scanner;

public class javaclass {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = a.nextInt();
        int sci = a.nextInt();
        int eng = a.nextInt();
        Grade me = new Grade(math, sci, eng);
        System.out.println("평균은" + me.average());
        a.close();
    }
}

class Grade {
    private int math,science,english;
    Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }
    public int average() {
        int aver = (math + science + english)/3;
        return aver;
    }
}