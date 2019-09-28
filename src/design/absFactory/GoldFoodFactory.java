package design.absFactory;

public class GoldFoodFactory implements absFactory {

	@Override
	public Pizzabs createPizzabs(String type) {
		// TODO Auto-generated method stub
		if(type.equals("VEGG")) {
			PizzaabsApple pv = new PizzaabsApple();
			pv.prepare();
//			pv.make();
			pv.complete();
			return pv;
		}
		return null;
	}

	@Override
	public Milkabs createMilkabs(String type) {
		// TODO Auto-generated method stub
		if(type.equals("milk")) {
			MilkApple ma = new MilkApple();
			ma.prepare();
//			ma.make();
			ma.complete();
			
			return ma;
		}
		return null;
	}


}
