package composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	ArrayList<MenuComponent> menuComponents=new ArrayList<MenuComponent>();
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return menuComponents.get(i);
	}


	public ArrayList<MenuComponent> getMenuComponents() {
		return menuComponents;
	}


	public String getName() {
		return name;
	}


	public String getDescription() {
		return description;
	}
	
	public void print(){
		System.out.println("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("-------------------- ");
		
		Iterator<MenuComponent> iterator=menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent menuComponent=iterator.next();
			menuComponent.print();
		}
	}


	@Override
	public Iterator<?> createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
	
	
}
