package facade;

public class Hotel {

	private String name;
	
	public Hotel(String name) {
		super();
		this.name = name;
	}
	
	public void roomBooking(String location) {
		System.out.println("Hotel "+ name+ "location"+location);
	}
	
}
