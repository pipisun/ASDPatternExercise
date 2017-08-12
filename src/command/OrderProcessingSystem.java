package command;

public class OrderProcessingSystem {
	private Command command;
	
	OrderProcessingSystem(Command command) {
		this.command = command;
	}
	
	public void invokeCommand() {
		command.execute();
	}
}
