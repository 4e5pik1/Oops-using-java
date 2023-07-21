import java.io.*;
import java.util.*;
class Fibonacci{
	public static void main(String args[]){
		int i,n;
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int n1=0,n2=1;
		int next=n1+n2;
		for(i=3;i<=n;++i)
		{
			System.out.printf("%d\t", next);
			n1=n2;
			n2=next;
		next=n1+n2;
		}
		System.out.printf(" ",n1, n2);
}}