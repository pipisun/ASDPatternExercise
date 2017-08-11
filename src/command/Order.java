package command;

public class Order {
	private String symbol;
	private int quantity;
	private String orderType;
	private double price;
	private String orderStatus;

	public Order(String symbol, int quantity, String orderType, double price, String orderStatus) {
		super();
		this.symbol = symbol;
		this.quantity = quantity;
		this.orderType = orderType;
		this.price = price;
		this.orderStatus = orderStatus;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
