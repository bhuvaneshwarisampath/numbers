/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowch;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Vowch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+ "is an vowel");
        }
        else
        {
            System.out.println(ch+"is an consonant ");
        }
        // TODO code application logic here
    }
}
