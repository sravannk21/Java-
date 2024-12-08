package sumOfTwoNumbers;

import java.util.Scanner;

public class Sum {
	public static void main(String ar[]) {
		System.out.println("Enter Two Numbers:");
		Scanner store= new Scanner(System.in);
		int num1=store.nextInt();
		int num2=store.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of two numbers is:"+sum);
	}
}
