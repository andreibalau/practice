package staticandnonstatictests;

public class Main {

	public static void main(String[] args) {
		StaticAndNonStatic parent = new StaticAndNonStatic("nonStatic","static");
		parent.nonStaticMethod();
		StaticAndNonStatic.staticMethod();
	}
}
