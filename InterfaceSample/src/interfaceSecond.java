
public class interfaceSecond {
	interfaceSample obj;
	interfaceSecond(interfaceSample obj){
		this.obj=obj;
	}
	void scan() {
		String text="this all collected texts";
		obj.onText(text);
	}
}
