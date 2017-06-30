import java.io.*;
import java.net.*;
import java.util.*;
class Palindrome
{
public static void main(String[] args)
{
int num,rev=0,rem;
int n;
Scanner s=new Scanner(System.in);
num=s.nextInt();
o=n;
while(num!=0)
{
rem=n%10;
rev=(rev*10)+rem;
num=num/10;
}
if(n==rev)
System.out.println("it is a palindrome");
else
System.out.println("it is not a palindrome");
}
}
