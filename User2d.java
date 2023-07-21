import java.io.*;
import java.util.*;
import java.util.Arrays;
class User2d{
public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
System.out.println("enter row of array");
int row=sc.nextInt();
System.out.println("Enter column length of an array: " );
int column=sc.nextInt();

int a[][]=new int[row][column];//declaration

System.out.print("Enter "+row*column+"Elements to Store in Array");

for (int i = 0; i < row; i++){


for (int j=0; j<column; j++){
 a[i][j]= sc.nextInt();}}

System.out.print ("Elements in Array are in"); 
for (int i = 0; i < row; i++){
for (int j=0; j<column; j++){
System.out.println("row["+i+"]: column["+j+"]:"+a[i][j]);}}}}