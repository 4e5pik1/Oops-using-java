import java.io.*;
import java.util.*;
public class Oneto{
	public static void main(String args[])
	{
		int n;
		System.out.printf("enter value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i=1,sum=0;
		while(i<=n)
		{
			sum=sum+i;
			i=i+2;
		}
		System.out.printf("%d",sum);}}