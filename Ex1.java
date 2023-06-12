package java.TP.TP03;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of seconds: ");
        int second = sc.nextInt();

        int hours = (int) second / 3600; // find hour
        int minute = (second % 3600) / 60; // find minute
        int second_result = second % 60; // find second

        System.out.println(
                "Time correspinding to " + second + "seconds is " + hours + ":" + minute + ":" + second_result);
    }
}
