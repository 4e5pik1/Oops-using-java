import java.io.*;
class Jagged{
public static void main(String args[]){
int a[][]={{1,2,3},{4,5,0},{6,7,8,9}};
for(int i=0;i<3;i++){
for(int j=0;j<a[i].length;j++){
System.out.print(a[i][j]+" ");}
System.out.println();}}}