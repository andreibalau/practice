package builder;

public class Main {

	public static void main(String[] args) {
		Robot robot = Robot.builder().buildHead("robocop head").build();
		
		System.out.println(robot.getHead());
	}

}
