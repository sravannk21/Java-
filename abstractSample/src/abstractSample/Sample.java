package abstractSample;

public class Sample extends Hello {
	void onText(String text) {
		System.out.println(text);
	}
	Sample(){
		TextScanner ts=new TextScanner(this);
		ts.scan();
	};
	public static void main(String ar[]) {
		Sample s=new Sample();
	}
}
