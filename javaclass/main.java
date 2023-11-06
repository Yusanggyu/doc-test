import java.util.Scanner;

class TV {
    String bran;
    int yea, inc;
    TV(String brand, int year, int inch) {
        this.bran = brand;
        this.yea = year;
        this.inc = inch;
    }
    void show() {
        System.out.printf(bran+"에서 만든 "+yea+"년형 " + inc + "인치 TV");
    }
}

public class main {
    public static void main(String[] args) {
        TV a = new TV("LG",2017,32);
        a.show();
    }
}