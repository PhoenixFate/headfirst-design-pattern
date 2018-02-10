package template_method_pattern;

public class Tea extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
}
