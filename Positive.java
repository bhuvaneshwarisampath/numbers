/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package positive;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Positive {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int s;
       s=sc.nextInt();
       if(s>=0)
       {
           System.out.println("it is positive");
       }else
       {
        System.out.println("it is negative ");
    }
}
}