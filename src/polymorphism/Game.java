package polymorphism;

public class Game {
	private String name;
	private PlatformCompatibility platform;

	public Game(String name, PlatformCompatibility platform) {
		this.name = name;
		this.platform = platform;
	}
	
	public String getName() {
		return name;
	}
	
	public PlatformCompatibility getPlatformCompatibility() {
		return platform;
	}

}
