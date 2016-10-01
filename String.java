package hello;

import java.util.Scanner;

public class Hello 
{
    public static void main(String[] args) 
    {
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    
                    if((i+1)==j)
                    {
                        String s1,s2;
                        s1=str.substring(0,j);
                        s2=str.substring(j);
                        s2="*"+s2;
                        str=s1.concat(s2);
                  
                    }
                    else
                    continue;
                }
                
            }
        }
        System.out.println(str);
    }
    
}