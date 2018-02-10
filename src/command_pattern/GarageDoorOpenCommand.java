package command_pattern;

public class GarageDoorOpenCommand implements Command{
	GarageDoor garageDoor=new GarageDoor();
	
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor=garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.open();
	}
	

}
