/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recur;

/**
 *
 * @author KSRIET
 */
public class Recur {

    
    public static void main(String[] args)
    {
        rec(1);
        // TODO code application logic here
    }
    public static void rec(int i)
    {
        if(i<=100)
        {
            System.out.println(i);
            rec(i+1);
        }
       // return 0;
    }
}
