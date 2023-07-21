import java.io.*;
import java.util.*;
class Arraylarge{
public static void main(String args[]){
int a[]={1,2,3,4,5,6};
int n,i;
n=a.length;
int max=a[0];
int min=a[0];

for(i=0;i<n;i++){
if(min<a[i]){

min=a[i];
}
else if(max>a[i]){
max=a[i];}


System.out.println(max);

System.out.println(min);

}
}}