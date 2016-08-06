

import java.util.Scanner;



public class Guvi5 {
 public static void main(String[] args) 
    {
 Scanner s=new Scanner(System.in);
        int t;int f=0;
        int[] ab=new int[5];
        System.out.println("enter array of 5 elements");
        for(int i=0;i<5;i++)
        {
            ab[i]=s.nextInt();
        }
        System.out.println("enter ur target number"); 
        t=s.nextInt();
          for(int i=0;i<5;i++)
          {
         for(int j=i;j<5;j++)
         {
             if(ab[i]+ab[j]==t)
             {  f++;
                 System.out.println(ab[i]+"+ "+ab[j]+"= "+t);}
    
          }}
          if(f==0)
              System.out.println("no numbers in array will give target while adding");
        
    }
        }
    
