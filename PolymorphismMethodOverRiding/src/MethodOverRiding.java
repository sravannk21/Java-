
public class MethodOverRiding {
public static void main(String ar[]) {
	display();
	parentClasss obj = new parentClasss();
	obj.display();
}
static void display() {
	System.out.println("hello");
}
}

/*
 * if we create two methods with same name in both base and sub class when we try to call the method to the
 * sub class only the sub class fuction will be exicuted becouse of polymorphism in java
 * if you create same name in both base and sum class when run time environment only subclass method
 * will be exicutable this type of action is called method over riding*/
