package proxy_pattern;

public class SoldState implements State{
	GumballMachine gumballMachine;
	 
	public SoldState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice dosen't get you another gumball");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.count>0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			System.out.println("Oops, out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}
	
	
}
