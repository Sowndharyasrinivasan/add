import java.util.*;
import java.io.*;
class pro17
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("ENTER A NUMBER:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<n;i++)
        {
            int len=length(i) ;
            int x=0,mux=1;
            int temp=i;
            for(int j=0;j<len;j++)
           {
               x=temp%10;
               mux=mux*x;
               temp=temp/10;           
            }
            int p=i*mux;
            if(p==n)
            {
            System.out.println("THE SEED FOR THE NUMBER << "+n+" >> IS << "+i+" >>");
            }
        }
    }
       static int length(int a)
     {
        int count=0;
        while(a!=0)
         {
            count++;
            a=a/10;   
         }return count;
     }
    
}