package java.TP.TP02;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFalse = false;
        do{
            System.out.println("===== Program for guessing your luckiest number =====");
            System.out.print("\tPlease input positive number : ");
            int num = sc.nextInt();
            if(num>0){
                System.out.println("\tYour luckiest number is " + (num+1)+ ".");
                break;
            }else{
                System.out.println("\tYour number is not positive");
                isFalse = true;
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
            }
        }while(isFalse);  
    }
}