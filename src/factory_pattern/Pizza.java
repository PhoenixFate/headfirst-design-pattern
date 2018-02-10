package factory_pattern;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	ArrayList<Object>toppings=new ArrayList<Object>();
	
	abstract void prepare();
	
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	};
	void cut(){
		System.out.println("Cutting the pizza int diagonal slices");
	};
	void box(){
		System.out.println("Place pizza in offical PizzaStore box");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies=" + Arrays.toString(veggies)
				+ ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", clam=" + clam + ", toppings=" + toppings + "]";
	};
	
	
}
