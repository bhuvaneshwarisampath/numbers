/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Alpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character:");
        ch=sc.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                {
                    System.out.println(ch+ "is an alphabet");
                }
        else
        {
            System.out.println(ch+"is not an alphabet");
        }
    }
}
