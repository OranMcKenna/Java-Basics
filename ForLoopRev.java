package helloworld;

public class ForLoopRev {
    
    public static void main(String[] args){

        //for (initial value; test condition; modification to value)
        for (int i = 0; i < 5; i++){ //print i if less than 5, then add 1
            System.out.println(i);
        }

        int[] myNumbers = {10,20,30,40,50}; //declare and initialize array

        for (int i = 0; i <myNumbers.length; i++){
            System.out.print(myNumbers[i] + " ");
        }

        System.out.print("\n"); //new line

        int[] myAr = {100,200,300,400,500}; //declare and initialize array

        for (int a = 0; a < myAr.length; a++){
            System.out.print(myAr[a] + " ");
        }

        System.out.print("\n"); //new line

        for (int item : myAr)
        System.out.println(item);
    }
}
