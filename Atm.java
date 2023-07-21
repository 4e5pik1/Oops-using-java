import java.util.*;
import java.io.*;
class Atm{
public static void main(String args[] ){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int[] a = new int[n];
for(int i=0;i<n;i++){
a[i] = scan.nextInt();
}
for(int i=0;i<n-1;i++){
	System.out.println(a[i]);
	
if(a[i]>a[i+1]){
count=count++;}
}
System.out.println(count);
}
}