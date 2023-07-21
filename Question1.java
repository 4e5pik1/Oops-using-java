import java.io.*;
import java.util.*;
class Question1{
	public static void main(String args[]){
		int count;
		int i;
		System.out.println("enter the name");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
   for(i=1;i<=a;i++){
   count++;}
   System.out.println(count);
if(count%2==0)
{
	System.out.println("valid");
}
else
{
	System.out.println("invalid");
}}}