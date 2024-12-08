package testing;

import accessSpecifiers.*;

public class sample {
	hello h=new hello();
	public sample(){
//		h.display();
		h.hey();
		test();
	}
	/*hello method can not be accesable becouse of its specified as defult specifier so its only
	 * accisabile inside the same packages
	 */
	 private void test() {
		System.out.println("welcome to private");
	}
	 protected void testingAgain() {
		 System.out.println("this is the example for the protected method declaration");
	 }
}
