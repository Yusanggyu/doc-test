import java.util.Scanner;

public class javaclass7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int select,day;
        String work;
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(true) {
            System.out.println();
            System.out.print("할일 (입력:1, 보기:2, 끝내기:3) >> ");
            select = a.nextInt();
            if (select == 3) { System.out.println("프로그램을 종료합니다."); break; }
            else if (select == 1) {
                System.out.printf("날짜(1~30)?");
                day = a.nextInt();
                System.out.printf("할일(빈칸없이입력)?");
                work = a.nextLine();
                Day b = new Day();
                a.set();
            }
            else if (select == 2) {
                System.out.printf("날짜(1~30)?");
                day = a.nextInt();
                System.out.println(day + "일의 할 일은" +  a.show());
            }
        }
    }
}


class Day {
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}
