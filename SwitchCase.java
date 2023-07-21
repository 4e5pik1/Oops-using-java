import java.io.*;
import java.util.*;
class SwitchCase{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("choose case");
int r,l,w;
int choice;
choice = s.nextInt();
switch(choice){
case 1:
System.out.println("r=");
r = s.nextInt();
double area=3.14*r*r;
double perimeter=2*3.14*r;
System.out.println("area"+area);
System.out.println("perimeter"+perimeter);
break;
case 2:
System.out.println("l="); 
l = s.nextInt();
int area1=4*l;
int perimeter1=4*l;
System.out.println("area"+area1);
System.out.println("perimeter"+perimeter1);
break;
case 3:
System.out.println("w=");
l = s.nextInt();
w = s.nextInt();
int area3=w*l;
int perimeter3=2*l+2*w;
System.out.println("area"+area3);
System.out.println("perimeter"+perimeter3);
break;

}}}
