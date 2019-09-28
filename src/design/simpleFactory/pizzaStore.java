package design.simpleFactory;

public class pizzaStore {
	
	private SimplePizz spfactory;

	public pizzaStore(SimplePizz spfactory) {
		this.spfactory = spfactory;
	}
	
	public void orderPizza(String typePizza) {
		System.out.println("Ԥ������������");
		Pizza pizza = spfactory.creat(typePizza);
		pizza.prepare();
		pizza.make();
		pizza.complete();
	}
}
