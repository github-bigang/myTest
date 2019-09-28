package design.simpleFactory;

import java.io.IOException;

public class PizzaMeet extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备meet");
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("makemeet");
	}

	@Override
	public void complete() {
		// TODO Auto-generated method stub
		System.out.println("完成meet");
	}

}
