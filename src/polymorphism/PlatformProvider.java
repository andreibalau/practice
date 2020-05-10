package polymorphism;

public class PlatformProvider {
	public static final Platform  pc = new Pc();
	public static final Platform  xbox = new Xbox();
	public static final Platform  ps = new Ps();
	
	PlatformCompatibility gamePlatformCompatibility;
	
	public Platform providePlatform(PlatformCompatibility gamePlatformCompatibility) throws Exception {
		switch(gamePlatformCompatibility) {
			case PC:
				return pc;
			case XBOX:
				return xbox;
			case PS:
				return ps;
			default:
                throw new Exception("Unknown Platform");
		}
	}
}
