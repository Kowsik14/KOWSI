import java.io.*;
import java.net.*;
import java.util.*;
public class SumN
{
public static void main(String[] args)
{
int n,i,sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
int num=s.nextInt();
sum+=num;
}
System.out.println(sum);
}}
