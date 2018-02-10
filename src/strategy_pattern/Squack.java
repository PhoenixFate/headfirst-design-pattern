package strategy_pattern;

public class Squack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squack!");
	}

}
