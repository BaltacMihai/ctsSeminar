package dp.chain.of.responsibility;

public class ProgMain {

	public static void main(String[] args) {
		
		
		AHandler waiter = new Waiter();
		AHandler chief = new Chief();

		waiter.setSuccessor(chief);
		waiter.processOrder(new Order("Coffee",3));
		waiter.processOrder(new Order("Pizza",15));
	}

}
