import java.io.*;
import java.util.*;
class Assignment{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("choose case");

int choice;
choice = s.nextInt();
switch(choice){
case 1:
System.out.println("a=");
int a = s.nextInt();
System.out.println("b=");
int b = s.nextInt();
int addition=a+b;
System.out.println(addition);
break;
case 2:
System.out.println("c="); 
int c = s.nextInt();
System.out.println("d="); 
int d = s.nextInt();
int subtraction=c-d;
System.out.println(subtraction);

break;
case 3:
System.out.println("e="); 
int e = s.nextInt();
System.out.println("f="); 
int f = s.nextInt();
int multiplication=e*f;
System.out.println(multiplication);
break;

case 4:
System.out.println("g="); 
float g = s.nextFloat();
System.out.println("h="); 
float h = s.nextFloat();
double madulo=g%h;
System.out.println(madulo);
break;

case 5:
System.out.println("i="); 
int i = s.nextInt();
System.out.println("j="); 
int j = s.nextInt();
int division=i/j;
System.out.println(division);
break;


}}}
