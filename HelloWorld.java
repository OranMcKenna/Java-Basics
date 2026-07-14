package helloworld;
import java.util.Arrays; //import Arrays class for array manipulation

public class HelloWorld { //class

    public static void main(String[] args) { //method
        //Print the classic Hello World message to the console
        System.out.println("Hello World");
        
        int counter; //declare counter variable
        counter = 1; //initialize counter variable
        //int counter = 1; //declare and initialize in one line
        
        System.out.println(counter++); //prints original counter and adds 1
        System.out.println(counter); //prints updated counter

        int myLength = "Hello World".length(); //get length of string
        System.out.println("Length of 'Hello World': " + myLength); //print length

        int[] userAge = {20, 18, 31, 25}; //declare and initialize array with shorthand syntax
        System.out.println("User age at index 0: " + userAge[0]); //access and print array element
        userAge[0] = 21; //modify array element at index 0
        System.out.println("Updated user age at index 0: " + userAge[0]); //print updated array element

        System.out.println(Arrays.toString(userAge)); //print entire array
        Arrays.sort(userAge); //sort the array
        System.out.println("Sorted user ages: " + Arrays.toString(userAge)); //print

        int[] myInt = {21,34,99,78,56,45,23}; //declare and initialize array
        Arrays.sort(myInt); //sort the array
        int foundIndex = Arrays.binarySearch(myInt, 45); //search for value 45
        System.out.println("Index of 45 in sorted array: " + foundIndex); //print index
        
        System.out.println("Oracle".substring(1,4)); //print substring from index 1 to 3


    }

}
