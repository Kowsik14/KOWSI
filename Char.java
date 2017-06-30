import java.io.*;
import java.net.*;
import java.util.*;
public class Char
{
public static void main(String[] args)
{
char c;
Scanner s=new Scanner(System.in);
c=s.nextLine().charAt(0);
if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U'))
System.out.println(c+" is a vowel");
else
System.out.println(c+" is a consonant");
}}
