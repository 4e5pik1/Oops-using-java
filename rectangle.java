import java.io.*;
import java.util.*;
class measure
{
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int b=s.nextInt();
int a=l*b;
int p=2*(l+b);
}

class rectangle
{
public static void main(String args[])
{
measure mea=new measure();
System.out.println("area is "+mea.a);
System.out.println("perimeter is "+mea.p);
int b=mea.l*mea.b;
System.out.println("area is "+b);
}
}