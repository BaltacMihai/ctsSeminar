package dp.state;

public class Employee {
	
	IState currentState;

	public Employee(IState currentState) {
		super();
		this.currentState = currentState;
	}
	
	public Employee() {
		super();
		this.currentState = new WorkingState();
	}
	
	public void setState(EState state) {
		
		switch(state) {
		case WORKING:
			this.currentState = new WorkingState();
			break;
		case AWAY:
			this.currentState = new AwayState();
			break;
		case VACATION:
			this.currentState = new VacationState();
			break;
		default:
			this.currentState = new WorkingState();
		}
		
	}
	
	public void processTask(String task) {
		this.currentState.act(task);
	}
	

}
