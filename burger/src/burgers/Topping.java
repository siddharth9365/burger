package burgers;

public enum Topping {
	Lettuce(0.57), Tomatoes(0.82), Carrots(0.73), 
	Olives(3.15), Mushrooms(3.36), Eggs(2.29), 
	Chillies(0.60), Bacon(4.25), Pickels(1.29),
	Onions(0.89), Cheese(1.79), Chips(3.89), Drinks(1.99);
	private double price;

	public double getPrice() {
		return price;
	}

	private Topping(double price) {
		this.price = price;
	}
	
}
