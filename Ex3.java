package java.TP.TP03;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Program for calculating cost of a call.\n");
        System.out.print("Please input start hours: ");
        float s_hours = sc.nextInt();
        System.out.print("Please input start minutes: ");
        float s_minutes = sc.nextInt();
        System.out.print("Please input start seconds: ");
        float s_seconds = sc.nextInt();
        System.out.println("\n\n");
        System.out.print("Please input end hours: ");
        float e_hours = sc.nextInt();
        System.out.print("Please input end minutes: ");
        float e_minutes = sc.nextInt();
        System.out.print("Please input end seconds: ");
        float e_seconds = sc.nextInt();

        // find
        float startSeconds = s_hours * 3600 + s_minutes * 60 + s_seconds;
        float endSeconds = e_hours * 3600 + e_minutes * 60 + e_seconds;
        float durationSeconds = endSeconds - startSeconds;

        // total duration
        int hours = (int) durationSeconds / 3600; // find hour
        int minute = (int) (durationSeconds % 3600) / 60; // find minute
        int second_result = (int) durationSeconds % 60;
        // find cost per minute

        float durationMinutes = (durationSeconds / 60);
        double cost = durationMinutes * 0.05;

        System.out.println("Total call duration: " + hours + "h " + minute + "m " + second_result + "s");
        System.out.printf("Total cost of this call: %1.4f $", cost);
    }
}
