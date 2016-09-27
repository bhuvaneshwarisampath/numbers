import java.io.*;
import java.util.*;
class hanoi
{
    static void HanLogi(int n,char a,char b,char c)
    {
        if(n==1)
        {
            System.out.println("MOVING THE DISK 1 FROM "+a+" TO "+b);
            return;
        }
        HanLogi(n-1,a,c,b);
        System.out.println("MOVING THE DISK "+n+" FROM "+a+" TO "+b);
        HanLogi(n-1,c,b,a);
    }
    public static void main(String[] args)
    {
        int num;
        char A='A',B='B',C='C';
        System.out.println("ENTER THE NUM OF DISK:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        HanLogi(num,A,B,C);
    }
}