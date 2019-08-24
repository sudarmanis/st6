import java.util.*;
class sud
{
public static void main(String argS[])
{
int n ,temp,s=0,re,a=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the initial no");
temp=sc.nextInt();
{
 while(temp!=0)
 {
 re=temp%10;
 s=s*10+re;
 temp=temp/10;
 }
 while(s!=0)
 {
 re=s%10;
 a=a*10+re;
 s=s/10;
 }
 System.out.println(a+"  ");
 }
}}
