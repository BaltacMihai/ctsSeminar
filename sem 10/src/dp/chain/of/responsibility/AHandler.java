package dp.chain.of.responsibility;

public abstract class AHandler {
	
	protected AHandler nextPerson;
	
	public void setSuccessor(AHandler nextPerson) {
		this.nextPerson = nextPerson;
		
	}
	public abstract void processOrder(Order o);
	

}
