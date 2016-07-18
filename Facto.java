/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facto;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Facto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n=5,i;
       int fact=1;
       
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the factorial no:");
        n=sc.nextInt();
       
        for(i=1;i<=n;i++)
               fact=fact*i;
        {
            System.out.println("the factorial" +n+ "is" +fact);
        }
    }
    }

