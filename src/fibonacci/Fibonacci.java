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
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the amount of Fibonacci numbers to display, 0 to exit");
       while (value != 0){
            while (!in.hasNextInt()){
                System.out.println("That is an invalid input");
                System.out.println("Enter the amount of Fibonacci numbers to display, 0 to exit");
                in.next();
            }
            value = in.nextInt();
            if (value < 0){
                System.out.println("That is an invalid input");
                System.out.println("Enter the amount of Fibonacci numbers to display, 0 to exit");
            }
            else if (value == 0){
                return;
            } else {
            printFibonacci(fibonacci(value));
            System.out.println("Enter the amount of Fibonacci numbers to display, 0 to exit");
       }
       }
    }
    
   public static int[] fibonacci(int value){
       int[] fibnumbers = new int[value + 1];
       fibnumbers[0] = 1;
       fibnumbers[1] = 1;
       for (int n = 2; n < value; n++){
           fibnumbers[n] = fibnumbers [n-1] + fibnumbers[n-2];
       }
       return fibnumbers;
   }
   public static void printFibonacci(int[] fibs){
       for (int n = 0; n < fibs.length - 1; n++){
       System.out.println(n + 1 + ": " + fibs[n]);
   }
}
}
