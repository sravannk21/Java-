package forLoopSample;

import java.util.Scanner;

public class SampleLoop {
	public static void main(String aar[]) {
		System.out.println("Enter the limit");
		Scanner storage=new Scanner(System.in);
		int limit=storage.nextInt();
		int sum=0;
		for(int i=0; i<=limit; i++) {
			sum+=i;
		}
		System.out.println("Sum of the numbers is:"+sum);
	}
}
