package burgers;

public class HealthyBurger extends Hamburger{
	public HealthyBurger() {
		this.name = "Healthy";
		this.rollType = "Brown";
		this.meat = "Bacon";
		this.price = 5.67;
	}
	public boolean checkItemsCount(){
		return toppings.size()<6;
	}
}
