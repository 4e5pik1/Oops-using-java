import java.io.*;
import java.util.*;
class Temperature{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the temperature");
int a;
a = s.nextInt();
if(a<0)
{
System.out.println("the freezing weather");
}
else if(a<=10)
{
System.out.println("very cold weather");
}
else if(a>=10&&a<=20)
{
System.out.println("cold weather");
}
else if(a>=20&&a<=30)
{System.out.println(" normel");
}
else if(a>=30&&a<=40)
{System.out.println(" hot");
}
else if(a>=40)
{System.out.println("very hot");
}
else
{
System.out.println("--- ");
}}}