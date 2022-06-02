package facade;

public class Flight {

	private String initialLocation;
	private String destination;
	private Airline airline;
	public String getInitialLocation() {
		return initialLocation;
	}
	public void setInitialLocation(String initialLocation) {
		this.initialLocation = initialLocation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public Flight(String initialLocation, String destination, Airline airline) {
		super();
		this.initialLocation = initialLocation;
		this.destination = destination;
		this.airline = airline;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flight [initialLocation=");
		builder.append(initialLocation);
		builder.append(", destination=");
		builder.append(destination);
		builder.append(", airline=");
		builder.append(airline);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
