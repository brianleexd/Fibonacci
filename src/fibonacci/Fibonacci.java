/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
/**
 *
 * @author Brian Lee
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int value = 1;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the amount of Fibonacci numbers you want to see");
       while (!in.hasNextInt()){
           System.out.println("That is an invalid input");
           System.out.println("Enter the amount of Fibonacci numbers you want to see");
           in.next();
       }       
       value = in.nextInt();
       printFibonacci(fibonacci(value));
    }
    
   public static int[] fibonacci(int value){
       int[] fibnumbers = new int[value];
       fibnumbers[0] = 1;
       fibnumbers[1] = 1;
       for (int n = 2; n < value; n++){
           fibnumbers[n] = fibnumbers [n-1] + fibnumbers[n-2];
       }
       return fibnumbers;
   }
   public static void printFibonacci(int[] fibs){
       for (int n = 0; n < fibs.length; n++){
       System.out.println(n + 1 + ": " + fibs[n]);
   }
}
}
