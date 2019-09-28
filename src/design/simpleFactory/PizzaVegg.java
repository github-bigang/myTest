package design.simpleFactory;

public class PizzaVegg extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备蔬菜");
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("make蔬菜");
	}

	@Override
	public void complete() {
		// TODO Auto-generated method stub
		System.out.println("完成蔬菜");
	}

}
