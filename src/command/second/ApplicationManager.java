package command.second;

import java.util.Stack;

public class ApplicationManager {
	private Command currentCommand = null;
	private Stack<Command> commandsExecuted = new Stack<Command>();

	public void saveInfoOperation(Command command) {
		this.currentCommand = command;
		currentCommand.execute();
	}
	
	public void validateCreditCardInfoOperation(Command command, CreditCard card) {
		this.currentCommand = command;
		boolean isValidated = currentCommand.execute();
		commandsExecuted.push(currentCommand);
		if(!isValidated) {
			commandsExecuted.pop().undo();
		}
	}
	
}
