package javaIfElseSample;

import java.util.Scanner;

public class sampleIf {
	public static void main(String ar[]) {
		System.out.println("Enter a number:");
		Scanner store=new Scanner(System.in);
		int num=store.nextInt();
		if(num<0) {
			System.out.println("Number is negative");
		}
		else if(num==0) {
			System.out.println("You have entered Zero");
		}
		else {
			System.out.println("Number is Positive");
		}
	}
}
