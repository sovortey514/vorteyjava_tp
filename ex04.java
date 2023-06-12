package java.TP.TP02;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n======== Program for counting the number of hundreds =======");
        System.out.print("\t Please input a positive number: ");
        int num = sc.nextInt();
        int counting = 0;
        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                counting++;
            }
        }
        System.out.println("There are " + counting + " hundreds in number " + num);
    }
}
