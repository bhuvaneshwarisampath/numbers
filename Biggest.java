
package biggest;

import java.util.Scanner;


public class Biggest {

   
    public static void main(String[] args) {
      int a,b,c;
    Scanner sc=new Scanner(System.in);
       
    a=Integer.parseInt(sc.nextLine());
    b=Integer.parseInt(sc.nextLine());
    c=Integer.parseInt(sc.nextLine());
       if(a>b)
        {  if(a>c)
              System.out.println("a is greater"); 
        }
          else if(b>c)
              {
                System.out.println("b is greater");
            }
          else {
                System.out.println("c is greater");
            }
    }
}

         




