/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Leapyear {

   
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=Integer.parseInt(sc.nextLine());
        if(a%4==0)
        {
            System.out.println(a+"is leap year");
            
        }
        else
        {
        System.out.println(a+"is not leap year");
                
       
    }
}
}