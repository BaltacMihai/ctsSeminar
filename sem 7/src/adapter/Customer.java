package adapter;

import java.util.Arrays;

public class Customer {
	
	private String name;
	private int noOrders;
	private int[] ordersAmount;
	
	public Customer(String name, int noOrders, int[] ordersAmount) {
		super();
		this.name = name;
		this.noOrders = noOrders;
		this.ordersAmount = ordersAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOrders() {
		return noOrders;
	}
	public void setNoOrders(int noOrders) {
		this.noOrders = noOrders;
	}
	public int[] getOrdersAmount() {
		return ordersAmount;
	}
	public void setOrdersAmount(int[] ordersAmount) {
		this.ordersAmount = ordersAmount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [name=");
		builder.append(name);
		builder.append(", noOrders=");
		builder.append(noOrders);
		builder.append(", ordersAmount=");
		builder.append(Arrays.toString(ordersAmount));
		builder.append("]");
		return builder.toString();
	}

}
