import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int order = 1;
        while(true) {
            System.out.print("신규 고객이면 1번, 기존 고객이면 2번, 종료하려면 3번을 입력하세요.>> ");
            int num = a.nextInt();
            if (num == 1) {
                order += 1;
                System.out.printf("> 이름 : ");
                String name = a.nextLine();
                System.out.printf("\n> 계좌번호 : ");
                int account_num = a.nextInt();
                System.out.printf("\n> 잔액 : ");
                int left = a.nextInt();
                System.out.printf("\n> 아이디 : ");
                String id = a.nextLine();
                System.out.printf("\n> 비밀번호 : ");
                int password = a.nextInt();
                new_account me = new new_account(order,name,account_num,left,id,password);
            }
        }
    }
}
class new_account {
    private int order, account_num, left, password;
    private String name, id;
    new_account(int order, String name, int account_num, int left, String id, int password) {
        this.order = order;
        this.name = name;
        this.account_num = account_num;
        this.left = left;
        this.id = id;
        this.password = password;
    }
    public String jsondata() {
        String 
    }
}