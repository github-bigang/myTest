package design.simpleFactory;

public class pizzaStore {
	
	private SimplePizz spfactory;

	public pizzaStore(SimplePizz spfactory) {
		this.spfactory = spfactory;
	}
	
	public void orderPizza(String typePizza) {
		System.out.println("圓協。。。。。");
		Pizza pizza = spfactory.creat(typePizza);
		pizza.prepare();
		pizza.make();
		pizza.complete();
	}
}
