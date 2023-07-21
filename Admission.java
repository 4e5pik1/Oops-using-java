import java.io.*;
import java.util.*;
class Admission{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the mark");
int maths = s.nextInt();
int chemistry=s.nextInt();
int physics=s.nextInt();
int total=s.nextInt();
int total2=s.nextInt();
if(maths>=65&&physics>=55&&chemistry>=50&&total>=180&&total2>=140)
{
System.out.println("eligible");}
else{
System.out.println("not eligible");

}
}
}
