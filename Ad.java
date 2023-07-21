import java.io.*;
import java.util.*;
public class Ad{
	public static void main(String args[]){
		int n;
		System.out.printf("enter value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int sum=1;
		int i=1;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
System.out.printf("%d",sum);}}