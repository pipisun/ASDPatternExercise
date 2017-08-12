package command;

public class TradingPlatform {
	public String getOrderState(Order order) {
		return order.getOrderStatus();
	}
}
