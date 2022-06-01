package dp.command;

public class Chief {
	
	private String name;
	
	
	public void cookPizza(String name) {
		
		System.out.println("The chief " + this.name + " is cooking " + name);
	}
	
	public void cookPasta(String name) {
		
		System.out.println("The chief " + this.name + " is cooking " + name);
		
	}

	public Chief(String name) {
		super();
		this.name = name;
	}

	
	
}
