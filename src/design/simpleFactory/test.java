package design.simpleFactory;

public class test {
	public static void main(String[] args) {
		SimplePizz spfactory = new SimplePizz();
		pizzaStore pizzaStore = new pizzaStore(spfactory);
		pizzaStore.orderPizza("MEET");
	}
}
