package decoractor_pattern;

public abstract class Beverage {
	String description="Unknow Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
