package java.TP.TP03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for conveting money in Riels to Dollars.\n");
        System.out.println("Conversion rate is: 1 USD = 4000 RIELS");
        System.out.print("Please input monney in Riels: ");
        float riels = sc.nextFloat();

        float us_change = riels/4000;

        System.out.println(riels+" RIELS = "+us_change+"USD");
    }
}
