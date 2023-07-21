import java.io.*;
import java.util.*;
class Table{
public static void main(String args[]){
int n,i;
System.out.println("enter the value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=15;++i)
{
System.out.printf("%d*%d=%d\n",n,i,n*i);
}}}