import java.io.*;
import java.net.*;
import java.util.*;
public class Multable
{
public static void main(String[] args)
{
int a,n=0;
Scanner s=new Scanner(System.in);
a=s.nextInt();
for(int i=1;i<=10;i++)
{
n+=a;
System.out.println(a+"*"+i+"="+n);
}
System.out.println();
}}
