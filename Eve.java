/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eve;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Eve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s;
        s=sc.nextInt();
        if(s%2==0)
        {
            System.out.println("it is an even number"); 
        }
        else
        {
            System.out.println("it is an odd number");
        }
        // TODO code application logic here
    }
}
