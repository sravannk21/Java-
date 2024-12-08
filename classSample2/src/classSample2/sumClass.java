package classSample2;

public class sumClass {
	public static void CalculateSum(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("sum of the two numbers:"+sum);
	}
	
	public static void Display(int num1,int num2) {
		CalculateSum(num1,num2);
	}
	
	public static int SumOfEvenNumbers(int num1) {
		int sum=0;
		for(int i=0; i<=num1; i++) {
			sum=sum+i;
		}
		return sum;
	}
}
