/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package natural;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Natural {

    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int n;
         Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
            //System.out.println();
            sum=sum+i;
            i++;
        }
        System.out.println("sum of"+n+ "numbers is:"+sum);
        // TODO code application logic here
    }
}
