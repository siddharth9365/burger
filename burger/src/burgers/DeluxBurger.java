package burgers;

public class DeluxBurger extends Hamburger{
	public DeluxBurger() {
		this.name = "Delux";
		this.rollType = "White";
		this.meat = "Sausage & Bacon";
		this.price = 14.54;
		toppings.add(Topping.Chips);
		toppings.add(Topping.Drinks);
	}
	public boolean checkItemsCount(){
		return toppings.size()<6;
	}
}
