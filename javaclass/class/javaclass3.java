import java.util.Scanner;

public class javaclass3 {
    public static void main(String[] args) {
        song a = new song(1978, "스웨덴", "ABBA", "Dancing Queen");
        a.show();
    }
}

class song {
    private int year;
    private String country;
    private String artist;
    private String title;
    song(int year, String country, String artist, String title) {
        this.year = year;
        this.country = country;
        this.artist = artist;
        this.title = title;
    }
    void show() {
        System.out.println(year + country + artist + title);
    }
}