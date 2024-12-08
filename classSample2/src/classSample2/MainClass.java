package classSample2;

import java.util.Scanner;

public class MainClass {
	public static void main(String ar[]) {
		int num1=23;
		int num2=25;
		sumClass obj=new sumClass();
		obj.Display(num1,num2);
		
		System.out.println("Enter your limit:");
		Scanner store=new Scanner(System.in);
		int limit=store.nextInt();
		
		int result=obj.SumOfEvenNumbers(limit);
		System.out.println("Sum of the numbers is:"+result);
	}
}
