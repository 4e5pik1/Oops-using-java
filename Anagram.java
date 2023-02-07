import java.io.*;
import java.util.*;
class Anagram{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str[]={"a","t","e"};
		String str1[]={"e","a","t"};
		
		int S=str.length;
			int S1=str1.length;
		for(int i=0;i<S;i++){
			for(int j=0;j<S1;j++){
				if(str[0]!=str1[0]){
					System.out.println(1);
			}
				else
					System.out.println(0);
}}}}