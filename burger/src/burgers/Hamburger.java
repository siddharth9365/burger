package burgers;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
	protected String name;
	protected String rollType;
	protected String meat;
	protected double price;
	protected List<Topping> toppings = new ArrayList<Topping>();
	
	public Hamburger() {
		this.name = "Basic";
		this.rollType = "White";
		this.meat = "Sausage";
		this.price = 3.56;
	}

	public double getPrice() {
		return price;
	}

	public List<Topping> getToppings() {
		return toppings;
	}
	
	public void addToppings(Topping topping){
		if(checkItemsCount()){
			toppings.add(topping);
		}else{
			System.err.println("Cannot add additional toppings to a "+name+" burger.");
		}
	}
	
	public boolean checkItemsCount(){
		return toppings.size()<4;
	}

	@Override
	public String toString() {
		return name+" hamburger on a "+rollType+" with "+meat+", Price is $"+price;
	}
	
	

}
