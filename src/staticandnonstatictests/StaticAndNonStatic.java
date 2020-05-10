package staticandnonstatictests;

public class StaticAndNonStatic {

	private static String staticField;
	private String nonStaticField;
	
	public StaticAndNonStatic(String staticField,String nonStaticField) {
		StaticAndNonStatic.staticField = staticField;//static referencing
		this.nonStaticField = nonStaticField;
	}
	
	public void nonStaticMethod() {
		System.out.println("Non static method called");
//		this.staticMethod();//The static method staticMethod() from the type Parent should be accessed in a static way
		StaticAndNonStatic.staticMethod();//Is also acceptable without Parent.
	}
	
	public static void staticMethod() {
//		nonStaticMethod();//cannot pas non static reference to a static method
		System.out.println("Static method called");
//		this.nonstaticField = "";//Cannot use this in a static context 
	}
}
