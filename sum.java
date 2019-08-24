import java.util.*;
class sum
{
public static void main(String argS[])
{
int n ,temp,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the initial no");
temp=sc.nextInt();
{
 while(temp!=0)
 {
 n=temp%10;
 s=s+n;
 temp=temp/10;
 }
 System.out.println(s);
 }
 }
 }
