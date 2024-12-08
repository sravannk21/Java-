package starPyramid;

import java.util.Scanner;

public class StarPyramid {
	public static void main(String ar[]) {
		System.out.println("Enter your limit:");
		Scanner storage=new Scanner(System.in);
		int limit=storage.nextInt();
		int space=limit+5;
		for(int i=0; i<=limit; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
	}
}
