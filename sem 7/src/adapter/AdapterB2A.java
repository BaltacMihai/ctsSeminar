package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB {

	@Override
	public double calculateDiscountB(Customer c) {
		// TODO Auto-generated method stub
		//calculate total of order
		return this.calculateDiscountA(c.getNoOrders());
	}
	
	

}
