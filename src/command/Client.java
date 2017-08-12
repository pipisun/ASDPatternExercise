package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order1 = new Order("AAPL", 50, "buy", 160, "Not Filled");
		Order order2 = new Order("GOOG", 100, "sell", 160, "Fully Filled");

		TradingPlatform platform = new TradingPlatform();
		TradingGateway tpf = new TradingGateway(platform);

		Command command1 = new BuyCommand(order1, tpf);
		Command command2 = new SellCommand(order2, tpf);
		Command command3 = new CancelCommand(order1, tpf);
		Command command4 = new CancelCommand(order2, tpf);

		OrderProcessingSystem ops = new OrderProcessingSystem(command1);
		ops.invokeCommand();

		ops = new OrderProcessingSystem(command2);
		ops.invokeCommand();

		ops = new OrderProcessingSystem(command3);
		ops.invokeCommand();

		ops = new OrderProcessingSystem(command4);
		ops.invokeCommand();
	}

}
