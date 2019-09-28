package design.adapter;

public class carImpl implements carFactory {

	@Override
	public CCar creatCarr() {
		// TODO Auto-generated method stub
		CCar car = new CCar();
		car.setColor("red");
		return car;
	}
	
}