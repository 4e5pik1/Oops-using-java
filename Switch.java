import java.io.*;
import java.util.*;
class Switch{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("choose case");
int a,m,d,e;
int choice;
choice = s.nextInt();
switch(choice){
case 1:
System.out.println("a=");
a = s.nextInt();
System.out.println("b=");
b = s.nextInt();
int addition=a+b;
System.out.println("addition",addition);
break;
case 2:
System.out.println("a="); 
a = s.nextInt();
System.out.println("b="); 
b = s.nextInt();
int subtraction=a-b;
System.out.println("subtraction",subtraction);

break;
case 3:
System.out.println("a="); 
a = s.nextInt();
System.out.println("b="); 
b = s.nextInt();
int multiplication=a*b;
System.out.println("multiplication",multiplication);
break;

case 4:
System.out.println("a="); 
a = s.nextInt();
System.out.println("b="); 
b = s.nextInt();
int madulo=a%b;
System.out.println("madulo",madulo);
break;

case 5:
System.out.println("a="); 
a = s.nextInt();
System.out.println("b="); 
b = s.nextInt();
int division=a/b;
System.out.println("division",division);
break;


}}}
