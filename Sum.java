import java.io.*;
import java.net.*;
import java.util.*;
public class Sum
{
public static void main(String args[])
{
int num,i,sum=0;
Scanner s =new Scanner(System.in);
num=s.nextInt();
for(i=1;i<=num;i++)
{
sum+=i;
}
System.out.println(""+sum);
}}
