import java.io.*;
import java.net.*;
import java.util.*;
public class Alphabet
{
public static void main(String[] args)
{
char c;
Scanner s=new Scanner(System.in);
c=s.nextLine().charAt(0);
if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
System.out.println(c+" is a alphabet");
else
System.out.println(c+" is not a alphabet");
}}
