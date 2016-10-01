import java.util.Scanner;

public class Stringsame {

	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		String s1=new String();
		String s2=new String();
		s1=r.next();
		s2=r.next();
		if(s1.equals(s2))
		{
			System.out.println("true"); 
		}
		else
		{
		System.out.println("false");
	}
	}

}