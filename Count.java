import java.io.*;
import java.net.*;
import java.util.*;
public class Count
{
public static void main(String[] args)
{
int num,count=0;
Scanner s=new Scanner(System.in);
num=s.nextInt();
while(num!=0)
{
num/=10;
count++;
}
System.out.println(count);
}}

