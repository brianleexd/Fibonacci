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
       int value = -1;
       while(value < 0){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the abmount of fibonacci numbers you want to see:");
       value = in.nextInt();
       }
       fibonacci(value);
    }
    
   public static int[] fibonacci(int value){
       int[] fibnumbers = new int[value];
       fibnumbers[0] = 1;
       fibnumbers[1] = 1;
       for (int n = 2; n < value; n++){
           fibnumbers[n] = fibnumbers [n-1] + fibnumbers[n-2];
           System.out.println(fibnumbers[n]);
       }
       return fibnumbers;
   }
}
