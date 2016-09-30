import java.util.*;
import java.lang.*;
import java.io.*;
class Multiply
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=sc.nextLine();
      int c=Integer.parseInt(a);
      int d=Integer.parseInt(b);
      String e=(c*d)+"";
      System.out.println(e);
	}
}