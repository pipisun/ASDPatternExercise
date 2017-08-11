package command;

public class TradingGateway {
	
	public TradingPlatform tpf;
	
	TradingGateway(TradingPlatform tpf) {
		this.tpf = tpf;
	}
	
	public void buyStock(Order order) {
		System.out.println("Buy in a stock...");
		System.out.println("Here is the details:");
		System.out.println("Symbol:" + order.getSymbol());
		System.out.println("Quantity:" + order.getQuantity());
		System.out.println("Price:" + order.getPrice());
		System.out.println("Order status:" + order.getOrderStatus());
		System.out.println();
	}
	
	public void sellStock(Order order) {
		System.out.println("Sell out a stock...");
		System.out.println("Here is the details:");
		System.out.println("Symbol:" + order.getSymbol());
		System.out.println("Quantity:" + order.getQuantity());
		System.out.println("Price:" + order.getPrice());
		System.out.println("Order status:" + order.getOrderStatus());
		System.out.println();
	}
	
	public void cancelOrder(Order order) {
		if(tpf.getOrderState(order).equalsIgnoreCase("Not filled")) {
			System.out.println("Your order has been cancelled.");
			order.setOrderStatus("Canceled");
		}
		else
			System.out.println("The order has been filled. You cannot cancel it.");
		System.out.println();
	}
}
