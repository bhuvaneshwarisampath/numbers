/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intrev;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Intrev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int n= 61019;
       // Scanner sc=new Scanner(System.in);
         System.out.println("enter the factorial no:");
         Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int num1;
                int rev = 0;
                int temp = 0;
               
                while(n>0)
                {
                  temp = n%10;
                  rev = rev * 10 + temp;
                  num1 = n/10;
                         
                }
            System.out.println("Reversed Number is: " + rev);
        }
}
 
        
        // TODO code application logic here
    

