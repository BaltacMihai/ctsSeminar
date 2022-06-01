package dp.chain.of.responsibility;

public class Waiter extends AHandler {

	@Override
	public void processOrder(Order o) {
		
		if(o.getDifficulty() < 5) {
			System.out.println("The waiter is handling this: " + o.getName());
		}
		
		else {
			
			System.out.println("The waiter can not handle this: " + o.getName());
			this.nextPerson.processOrder(o);
		}
		
	}
	
	

}
