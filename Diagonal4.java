import java.io.*;
import java.util.*;
class Diagonal4{
	public static void main(String args[]){
		int i,j;
		int n=1;
		
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		
	for(i=1;i<=r;i++){
		for(j=1;j<=i;++j)
		{
		System.out.print(n);
		++n;
		}
		System.out.println("\n");
}}}