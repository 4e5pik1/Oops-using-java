import java.io.*;
import java.util.*;
class Celsius{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter celsius");
double Cel=s.nextInt();

double F=Cel*1.8+32;
System.out.println(F);
}}