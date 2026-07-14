package helloworld;
import java.util.Scanner;

public class ScannerRev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println(" ");
        // System.out.print("\nEnter an integer: ");
        // int userInt = input.nextInt();
        // System.out.print("You have entered: "+ userInt);

        // System.out.print("\nEnter a double: ");
        // double userDouble = input.nextDouble();
        // System.out.printf("You have entered : %.2f", userDouble);

        System.out.print("\nEnter 18: ");
        //input.nextLine();
        int userInt = input.nextInt();
        if(userInt != 18){
             System.out.print("\nYou have not entered \"18\".");
        }
        else{
            System.out.print("\nGood.");
        }

    }
}
