import java.io.*;
import java.util.*;
public class powertwo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean flag=false;
for(int i=0;i<n;i++)
{
if(n==Math.pow(2,i))
flag=true;
}
if(flag)
System.out.println(true);
else
System.out.println(false);
}
}