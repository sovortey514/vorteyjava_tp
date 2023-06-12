package java.TP.TP03;
import java.util.Scanner;

public class Ex6_Task_Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1>0){
            System.out.println("---------- Menu ----------");
            System.out.println("""
                1. Seconds to Time
                2. Time to Seconds
                3. Calling Cost
                4. Riels to Dollar
                5. Traveling Duration
                0. Exit
                """);
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Ex1.main(null);
                    break;
                case 2:
                    Ex2.main(null);
                    break;
                case 3:
                    Ex3.main(null);
                    break;
                case 4:
                    Ex3.main(null);
                    break;
                case 5:
                    Ex5.main(null);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(choice);
                    //break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("\n-----------------------");
        }
    }
}
