/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strirev;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Strirev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1;
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        s1=sc.nextLine();
      String reverse = new StringBuffer(s1).reverse().toString();
      System.out.println("\n String before reverse:"+s1);
      System.out.println("String after reverse:"+reverse);
      
        // TODO code application logic here
    }
}
