/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi5;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Guvi6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,count=0;
        for(i=1;i<=n;i++){
            int val=Integer.bitCount(i);
            BigInteger bi=BigInteger.valueOf(val);
            boolean check=bi.isProbablePrime(1);
            if(check)    
                count+=1;
        }
        System.out.println("count- "+count);
}
        // TODO code application logic here
}

