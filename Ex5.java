package java.TP.TP03;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for calculating durationn of travel from ITC to Airport.\n");
        System.out.println("Please input traffic jam factor (in percentage [0-100]): ");
        float jam = sc.nextFloat();

        // v = d/t
        float viteese = 30*(jam/100);
        float duration = (7/viteese)*3600;

        int hours = (int) duration / 3600; // find hour
        float minute = (duration % 3600) / 60; // find minute
        float second_result = duration % 60; // find second

        System.out.printf("Traveling Duration = %d : %1.0f : %1.0f", hours, minute, second_result);
    }
}
