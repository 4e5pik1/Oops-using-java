import java.io.*;
import java.util.*;
class Positivedo{
public static void main(String args[]){
int a[]={-5,-4,-3,-2,-1,0,1,2,3,4,5};
int n=a.length;
int count=0;int count2=0;
for(int i=1;i<=n;i++){
if(i<=0){
	count=count++;
}
else if(i>=0){
count2=count2++;}
else{
	System.out.print(" ");
}}
if(count<count2){
	System.out.print(" negative ");
}
else
	System.out.print(" positive ");
}}