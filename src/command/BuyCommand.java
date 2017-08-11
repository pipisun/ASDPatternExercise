package command;

public class BuyCommand implements Command {
	private TradingGateway gateway;
	private Order order;
	
	BuyCommand(Order order, TradingGateway gateway) {
		this.gateway = gateway;
		this.order = order;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gateway.buyStock(order);
	}

}
