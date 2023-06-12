package java.TP.TP02;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nCalcualte value of x : 1/x = 1/y + 1/z\n");
        System.out.print("Input y: ");
        double y = sc.nextDouble();
        System.out.print("Input z: ");
        double z = sc.nextDouble();
        double x = 1 / (1 / y + 1 / z);
        System.out.println("-> x = " + x);
    }
}
