package polymorphism;

public class GameRunnable {
	private PlatformProvider platformProvider;
	private Platform platform;
	
	public GameRunnable(Game game) throws Exception {
		platformProvider = new PlatformProvider();
		platform = platformProvider.providePlatform(game.getPlatformCompatibility());
		runGameOnPlatform(platform);
	}
	
	private void runGameOnPlatform(Platform platform) {
		platform.launch();
	}
	
}
