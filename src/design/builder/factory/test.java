package design.builder.factory;

public class test {
	public static void main(String[] args) {
		RobotFactory robotFactory = new RobotFactory();
		Robot create = robotFactory.create();
		System.out.println(create.getBody());
	}
}
