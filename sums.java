package sum;

import java.util.Scanner;

public class countnotpalin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input;
		System.out.println("Enter the string");
		input=s.nextLine();
		if((input.length() % 2) == 0)
		{
			System.out.println("Maximun length of non palindrome substring is :"+input.length());
		}
		else
		{
			System.out.println("Maximun length of non palindrome substring is :"+(input.length()-1));
		}
       
	}
}