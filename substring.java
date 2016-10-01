import java.util.Scanner;


public class Closep {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character:");
		String s1=s.next();
		char[] x=s1.toCharArray();
		int count=0;
		for(int i=0;i<x.length-1;i++){
			 if(x[i]=='('){
				 if(x[i+1]==')'){
					 count+=2;
					 i++;
				 }
			 }
		}
		System.out.println(count);
	}