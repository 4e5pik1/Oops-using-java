import java.io.*;
import java.util.*;
class Oddeven{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter");
int x = s.nextInt();
if(x%2==0)
{
System.out.println("given number"+x+"is even");}
else{
System.out.println("given number"+x+"is odd");
}
}
}
