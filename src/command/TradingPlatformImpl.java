package command;

public class TradingPlatformImpl implements TradingPlatform {
	
	private Command command;
	
	@Override
	public void setCommand(Command command) {
		// TODO Auto-generated method stub
		this.command = command;
	}

	@Override
	public void invokeCommand(Command command) {
		// TODO Auto-generated method stub
		command.execute();
	}

	@Override
	public String getOrderState(Order order) {
		// TODO Auto-generated method stub
		return order.getOrderStatus();
	}

}
