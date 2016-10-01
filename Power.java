import java.io.*;
import java.util.Scanner;
public class power_of_two
{  
    public static void main(String args[])  
    {  

        Scanner in=new Scanner(System.in);
        int num = in.nextInt();

        int other = 1;  
        if(((~num) & 1) == 1)  
        {  
            System.out.println("The number is a power of two");  
        }  
        else  
        {
            System.out.println("The number is a  NOT A power of two");  
        }
    }  
} 