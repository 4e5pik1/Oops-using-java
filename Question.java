import java.io.*;
import java.util.*;
class Reverse1{
	public static void main(String args[]){
		int n,rev=0,rem;
int i;
int count=0;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		
	System.out.println(+rev);

 for(i=0;i<=rev;i++)
{
++count;
}}
 System.out.printf("%d",count);
if(count%2==0){
System.out.println(count);}
else
{
System.out.println(count);}

}}