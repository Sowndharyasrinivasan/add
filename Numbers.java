import java.util.*;
public class prgm25inpro {
    public static void main(String[] args) {
String ch[]=new String[7];//{000,001,010,100,101,110,1110};
int k;
Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
k=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<7;i++)
        {
            ch[i]=sc.next();
            System.out.println(""+ch[i]);
        }
      if(ch[0]=="000"&&ch[1]=="001"&&ch[2]=="010"&&ch[3]=="100"&&ch[4]=="101"&&ch[5]=="110"&&ch[6]=="1110")
{
for(k=1;k<=3;k++)
{
    System.out.println(ch);
}}
else
{
    System.out.println("invalid");
}

}
    }
    