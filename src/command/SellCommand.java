package command;

public class SellCommand implements Command {
	private TradingGateway gateway;
	private Order order;
	
	SellCommand(Order order, TradingGateway gateway) {
		this.gateway = gateway;
		this.order = order;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gateway.sellStock(order);
	}

}
