package design.Factory;

public class PizzaStore1 implements Factory {
	public void orderPizza(String typePizza) {		
		System.out.println("圓協。。。。。");
		design.Factory.Pizza pizza = create(typePizza);
		pizza.prepare();
		pizza.make();
		pizza.complete();
	}
	
	@Override
	public design.Factory.Pizza create(String typePizza) {
		// TODO Auto-generated method stub
		if(typePizza.equals("VEGG")) {
			return new PizzaVEGG();
		}
		else {
			return null;
		}
	}

}
