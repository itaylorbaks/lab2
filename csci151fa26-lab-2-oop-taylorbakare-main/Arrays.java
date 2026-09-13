/**
 * Explore using arrays
 * 
 * @author Your Name Goes Here
 */

import java.util.Scanner;
import java.util.InputMismatchException; 

public class Arrays {
     /**
     * The main function is the implementation of our program.
     * 
     * @param args The command line arguments, unused
     */
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter?: ");
        Scanner numbers = new Scanner(System.in);
        int[] arr = new int[numbers.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
           System.out.println("Number " + i + " value: ");
           arr[i] = numbers.nextInt();
        }
        numbers.close();
        System.out.println("Done!");
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
        }
        
    }

}