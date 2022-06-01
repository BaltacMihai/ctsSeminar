package dp.chain.of.responsibility;

public class Chief extends AHandler {

	@Override
	public void processOrder(Order o) {
		
		if(o.getDifficulty() >= 5) {
			System.out.println("The chief is handling this: " + o.getName());
			
		}
		
		else {
			//we can throw an exception
		}
		
		
	}
	

}
