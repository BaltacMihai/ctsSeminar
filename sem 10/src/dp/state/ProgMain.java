package dp.state;

public class ProgMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setState(EState.AWAY);
		emp.processTask("server down");

	}

}
