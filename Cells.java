package practice;
import java.util.Scanner;
public class Lcmilestone1 {

	      public static void main(String args[]) {  
	           Scanner sc = new Scanner(System.in);  
	           System.out.println("Enter the String:-");  
	           String str = sc.nextLine();  
	           System.out.println("Enter the length");  
	           int a = sc.nextInt();  
	           int b=str.length();
	          sc.close();
	           System.out.println(""+str.substring(b-a, b) );  
	           System.out.println(""+str.substring(0, a) );  
	      }  
} 