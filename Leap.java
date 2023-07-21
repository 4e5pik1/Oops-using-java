import java.io.*;
import java.util.*;
class Leap{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter");
int x = s.nextInt();
if(x%4==0)
{
System.out.println("given year" +x+ "leap year");}
else{
System.out.println("given year" +x+ "not an leap year");
}
}
}
