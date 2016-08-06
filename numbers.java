import java.util.*;
import java.io.*;

class Sum0
{
public static void main(String[] args)
 {
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   double[] Arr=new double[n];
   System.out.println("ENTER THE ELEMENTS:");
   for(int i=0;i<n;i++)
    {
    Arr[i]=s.nextDouble();
    }
  for(int i=0;i<n;i++)
   {
       for(int j=0;j<n;j++)
       {
         if(Arr[i]+Arr[j]==0 || ((Arr[i]+Arr[j]<1)&&(Arr[i]+Arr[j]>-1)))
          System.out.println("ELEMENTS ARE:"+Arr[i]+","+Arr[j]);
       }     
   }
 }
}    