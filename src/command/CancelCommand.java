package command;

public class CancelCommand implements Command {
	private TradingGateway gateway;
	private Order order;
	
	CancelCommand(Order order, TradingGateway gateway) {
		this.gateway = gateway;
		this.order = order;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gateway.cancelOrder(order);
	}
}
