package polymorphism;

public class Main {

	public static void main(String[] args) throws Exception {
		Game assasinsCreed = new Game("AssasinsCreed", PlatformCompatibility.XBOX);
		GameRunnable gameRunnable = new GameRunnable(assasinsCreed);
	}
}
