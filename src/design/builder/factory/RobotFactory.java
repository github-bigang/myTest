package design.builder.factory;

public class RobotFactory {
	public Robot create() {
		Robot robot = new Robot();
		robot.setBody("body");
		robot.setHead("head");
		robot.setLegs("singleleg");
		return robot;
	}
}
