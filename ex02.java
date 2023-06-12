package java.TP.TP02;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        System.out.println("Program for calculatng perimeter and surface of Rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input width (in cm): ");
        double width = sc.nextDouble();
        System.out.print("Input height (in cm): ");
        double height = sc.nextDouble();
        double perimeter = 2 * (width + height);
        double surface = width * height;
        System.out.println("-> Perimeter: " + perimeter + " cm");
        System.out.println("-> Surface: " + surface + " cm2");
    }
}
