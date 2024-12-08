package functionSample;

import java.util.Scanner;

public class SampleFunction {
	public static void main(String ar[]) {
		System.out.println("Enter Two numbers:");
		Scanner store=new Scanner(System.in);
		int num1=store.nextInt();
		int num2=store.nextInt();
		int result=sum(num1,num2);
		System.out.println("sum of Two numbers:"+result);
	}
	
	static int sum(int num1,int num2) {
		int total=num1+num2;
		return total;
	}
}

