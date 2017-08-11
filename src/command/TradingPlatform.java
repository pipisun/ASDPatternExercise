package command;

public interface TradingPlatform {
	public void setCommand(Command command);
	public void invokeCommand(Command command);
	public String getOrderState(Order order);
}
