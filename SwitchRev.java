package helloworld;
import java.util.Scanner;

public class SwitchRev {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        String userGrade = input.nextLine().toUpperCase();

        switch (userGrade){
            case "A+": //no break, will execute distinction for A+ and A

            case "A":
            System.out.println("Distinction");
            break;

            case "B":
            System.out.println("B Grade");
            break;

            case "C":
            System.out.println("C Grade");
            break;

            default:
            System.err.println("Fail");
            break;

        }
    }
}
