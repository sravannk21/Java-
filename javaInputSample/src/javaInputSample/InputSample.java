package javaInputSample;

import java.util.Scanner;

public class InputSample {
	public static void main(String ar[]) {
		System.out.println("Enter Two Numbers:");
		Scanner sample=new Scanner(System.in);
		int a=sample.nextInt();
		int b=sample.nextInt();
		System.out.println(a+"\t"+b);
	}
}
