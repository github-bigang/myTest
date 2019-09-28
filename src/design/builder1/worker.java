package design.builder1;

public class worker {
	public Robot dircotor(RobotBuilder robotBuilder) {
		robotBuilder.creathead();
		robotBuilder.creatbody();
		robotBuilder.creatleg();
		return robotBuilder.creatrobot();
	}
}
