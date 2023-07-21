import java.io.*;
import java.util.*;
class Sorting{
public static void main(String args[]){
int a[]={2,4,8};
int b[]={2,3,4,8,10,16};
int c[]={4,8,14,40};
int al=a.length;
int bl=b.length;
int cl=c.length;
int i=0,j=0,k=0;
while(i<al&&j<bl&&k<cl){
if(a[i]==b[j]&&b[j]==c[k]){
System.out.print(a[i]+" ");
i++;
j++;
k++;
}
else if(a[i]<b[j]){
i++;}
else if(b[j]<c[k]){
j++;}
else
k++;
}}}