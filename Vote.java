import java.io.*;
import java.util.*;
class Vote{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter");
int x = s.nextInt();
String a=(x>=18)?"vote":"not vote";
System.out.println(a);
}}