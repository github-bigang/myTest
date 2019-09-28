package design.absFactory;

public class store {
	public static void order(String typefood,String typeTemp,String typePizza) {
		if(typefood.equals("pizza")) {
			if(typeTemp.equals("cold")) {
				if(typePizza.equals("VEGG")){
					GoldFoodFactory goldPizza = new GoldFoodFactory();
					goldPizza.createPizzabs("VEGG");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * store s = new store(); s.order("pizza", "cold", "VEGG");
		 */
		order("pizza", "cold", "VEGG");
	}
}
