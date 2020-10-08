package upcastdowncast;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Child();// upcast
		Child child = (Child) parent;// downcast

		parent.walk();
		parent.talk();

		child.talk();
	}
}
