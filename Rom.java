/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rom;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Rom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String RomanNo = "";
		int DecimalNo = 0;
		System.out.println("Enter a roman number : ");
		      Scanner input = new Scanner(System.in);
		RomanNo = input.next();
				int length=  RomanNo.length();
        int num=0;
        int prenum = 0;
        for (int i=length-1;i>=0;i--)
        { 
                char x =RomanNo.charAt(i);
                x = Character.toUpperCase(x);
                switch(x)
                {  
                        case 'I':
                        prenum = num;
                        num = 1;
                        break;
                        case 'V':
                             prenum = num;
                        num = 5;
                        break;
                        case 'X':
                                prenum = num;
                        num = 10;
                        break;
                        case 'L':
                                prenum = num;
                        num = 50;
                        break;
                        case 'C':
                                prenum = num;
                        num = 100;
                        break;
                        case 'D':
                                prenum = num;
                        num = 500;
                        break;
                        case 'M':
                                prenum = num;
                        num = 1000;
                        break;
		           	}
                if (num<prenum)
                {DecimalNo= DecimalNo-num;}
                 else
                DecimalNo = DecimalNo +num;
        }
        System.out.println("The Equilvalent Roman number is " + DecimalNo);
 	}
}
    


        // TODO code application logic here
    

