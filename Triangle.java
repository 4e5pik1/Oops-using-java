import java.io.*;
import java.util.*;
class Triangle{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
int sum=x+y+z;
if(sum==180){
System.out.println("triangle");
}
else
{
System.out.println("not triangle");
}}}
