package factory_pattern;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory=ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+name );
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		cheese=ingredientFactory.createCheese();
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub

	}

	@Override
	public void box() {
		// TODO Auto-generated method stub

	}

}
