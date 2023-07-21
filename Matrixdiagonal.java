import java.io.*;
import java.util.*;
class Matrixdiagonal {
	
	public static void main(String args[])
	{
		int n = 4;
		int a[][] = { { 1, 2, 3, 4 },
					{ 5, 6, 7, 8 },
					{ 1, 2, 3, 4 },
					{ 5, 6, 7, 8 } };
          int MAX = 100;
		
	// Function to print the Principal Diagonal
	
		System.out.print("Principal Diagonal: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// Condition for principal diagonal
				if (i == j) {
					System.out.print(a[i][j] + ", ");
				}
			}
		}
		System.out.println("");
System.out.print("Secondary Diagonal: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// Condition for secondary diagonal
				if ((i + j) == (n - 1)) {
					System.out.print(a[i][j] + ", ");
				}
			}
		}
		System.out.println("");
	}}

