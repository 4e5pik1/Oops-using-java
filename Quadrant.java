import java.io.*;
import java.util.*;
class Quadrant{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the Quadrant point");
int a,b;
a = s.nextInt();
b = s.nextInt();
if(a>=0&&b>=0)
{
System.out.println("the points lies @ first quarant");
}
else if(a<=0&&b>=0)
{
System.out.println("the points lies @ second quarant");
}
else if(a<=0&&b<=0)
{
System.out.println("the points lies @ third quarant");
}
else if(a>=0&&b<=0)
{System.out.println("the points lies @ fourth quarant");
}
else
{
System.out.println("the");
}}}