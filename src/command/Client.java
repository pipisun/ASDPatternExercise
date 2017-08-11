package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order1 = new Order("AAPL", 50, "buy", 160, "Not Filled");
		Order order2 = new Order("GOOG", 100, "sell", 160, "Fully Filled");
		
		TradingPlatform platform = new TradingPlatformImpl();
		TradingGateway tpf  = new TradingGateway(platform);
		
		Command command1= new BuyCommand(order1, tpf);
		Command command2 = new SellCommand(order2, tpf);
		Command command3 = new CancelCommand(order1, tpf);
		Command command4 = new CancelCommand(order2, tpf);
		
		
		platform.setCommand(command1);
		platform.invokeCommand(command1);

		platform.setCommand(command2);
		platform.invokeCommand(command2);
		
		platform.setCommand(command3);
		platform.invokeCommand(command3);
		
		platform.setCommand(command4);
		platform.invokeCommand(command4);
	}

}
