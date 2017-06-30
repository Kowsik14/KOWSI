import java.io.*;
import java.net.*; 
import java.util.*;
public class Prime
{
public static void main(String[] args)
{
int number,i,count=0;
Scanner a=new Scanner(System.in);
System.out.print("Enter a number:");
number=a.nextInt();
for(i=2;i<number;i++)
{
if(number%i==0)
{
count++;
break;
}}
if(count==0)
System.out.print(number+" is prime");
else
System.out.print(number+" is not a prime");
}
}
