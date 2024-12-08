package abstractSample;

public class TextScanner {
	Hello obj;
	TextScanner(Hello obj) {
		this.obj=obj;
	}
	
	void scan() {
		String text="Scanner text";
		obj.onText(text);
	}
}
