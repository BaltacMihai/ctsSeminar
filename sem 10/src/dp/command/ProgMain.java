package dp.command;

public class ProgMain {

	public static void main(String[] args) {
		
		Chief chief1 = new Chief("John");
		Chief chief2 = new Chief("Maria");
		
		Waiter waiter = new Waiter();
		waiter.noteCommands(new PizzaOrder(chief1, "Diavola"));
		waiter.noteCommands(new PastaOrder(chief2, "Carbonara"));
		waiter.noteCommands(new PizzaOrder(chief1, "Margherita"));
        waiter.sendCommand();
	}

}
