package java.TP.TP03;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please in put hours: ");
        int hours = sc.nextInt();
        System.out.print("Please input minutes: ");
        int minute = sc.nextInt();
        System.out.print("Please input seconds: ");
        int seconds = sc.nextInt();

        int result = hours * 3600 + minute * 60 + seconds;

        System.out.print("Number of seconds = " + hours + "x3600 + " + minute + "x60 + " + seconds + "= " + result);
    }
}
