
public class Sample {
	public static void main(String ar[]) {
		display();
		display(45);
		display("hello");
	}
	static void display() {
		System.out.println("hello user");
	}
	static void display(int a) {
		System.out.println(a);
	}
	static void display(String a) {
		System.out.println(a);
	}
}
/*this is the example of method over loading in polymorphism in java 
here you can create same method name three times but each one are diffrent charactor 
second one in passing int argument and last one is passing string which means that we 
can use same method name for diffrent argument and data types
*/