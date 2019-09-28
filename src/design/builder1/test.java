package design.builder1;

public class test {
	public static void main(String[] args) {
		worker worker = new worker();
		SmartRobotBuilder smartRobotBuilder = new SmartRobotBuilder();
		Robot dircotor = worker.dircotor(smartRobotBuilder);
		System.out.println(dircotor.getHead());
	}
}
