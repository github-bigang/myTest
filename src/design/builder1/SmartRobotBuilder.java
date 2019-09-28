package design.builder1;

public class SmartRobotBuilder implements RobotBuilder {
	Robot robot = new Robot();

	@Override
	public void creathead() {
		// TODO Auto-generated method stub
		String head = "head";
		robot.setHead(head);
	}

	@Override
	public void creatbody() {
		// TODO Auto-generated method stub
		String body = "body";
		robot.setBody(body);
	}

	@Override
	public void creatleg() {
		// TODO Auto-generated method stub
		String leg = "body";
		robot.setBody(leg);
	}

	@Override
	public Robot creatrobot() {
		// TODO Auto-generated method stub
		return robot;
	}
	

}
