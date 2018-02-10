package composite_pattern;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
	
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	
	public void print(){
		System.out.println(" "+getName());
		if(isVegetarian()){
			System.out.println("(v)");
		}
		System.out.println(" "+getPrice());
		System.out.println(" --"+getDescription());
	}

	@Override
	public Iterator<?> createIterator() {
		return new NullIterator();
	}
	
}
