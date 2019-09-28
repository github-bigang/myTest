package design.simpleFactory;

public class SimplePizz {
	public Pizza creat(String typePizze) {
		if(typePizze.equals("VEGG")) {
			return new PizzaVegg();
		}
		if(typePizze.equals("MEET")) {
			return new PizzaMeet();
		}
		else {
			return null;
		}
	}
}
