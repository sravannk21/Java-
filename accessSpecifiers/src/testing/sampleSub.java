package testing;

public class sampleSub extends sample{
	sample s=new sample();
	sampleSub(){
//		s.test();
//		this method call is not work becouse of in the sample class this method created as
//		private so its only worked inside that class and methods only if we create the object for 
//		that class it not possible to exicute
		s.testingAgain();
//		this method created as protected type in base class so this method only accesable inside the 
//		base class and sub class 
	}
}
