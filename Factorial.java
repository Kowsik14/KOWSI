import java.io.*;
import java.net.*;
import java.util.*;
public class Factorial
{
public static void main(String args[])
{
int num,fact=1,i;
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(i=1;i<=num;i++)
{
fact*=i;
}
System.out.println(fact);
}}
