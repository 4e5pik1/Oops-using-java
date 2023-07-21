import java.io.*;
import java.util.*;
import java.util.Arrays;
class Indexaddition{
public static void main(String args[]){
int a[]={1,2,4,5,6};
int n=a.length;
int target=9;
for(int i=0;i<n-1;i++){
for(int j=0;j<n;j++){
if(a[i]+a[j]==target){
System.out.printf("(%d,%d)",a[i],a[j]);
}}}}}