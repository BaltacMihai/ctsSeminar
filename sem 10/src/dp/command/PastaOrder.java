package dp.command;

public class PastaOrder implements ICommand {
	
	private Chief chief;
	private String name;

	@Override
	public void process() {
		this.chief.cookPasta(name);
		
	}

	public PastaOrder(Chief chief, String name) {
		super();
		this.chief = chief;
		this.name = name;
	}

	public Chief getChief() {
		return chief;
	}

	public void setChief(Chief chief) {
		this.chief = chief;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
