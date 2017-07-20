import java.io.*;
import java.net.*;
import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
int num,sum=0,n,a;
Scanner s=new Scanner(System.in);
num=s.nextInt();
n=num;
while(n!=0)
{
a=n%10;
n=n/10;
sum=sum+(a*a*a);
}
if(num==sum)
System.out.println("it is a armstrong number");
else
System.out.println("it is not a armstrong number");
}
}
