package facade;

public class Facade {

	
	public static void reservation(String initialLocation, String destination) {
		Hotel hotel = new Hotel("London Hilton");
		hotel.roomBooking("London");
		
		
		Airline airline = new Airline("BlueAir");
		Flight toGo = airline.flightBooking("Bucharest", "Londra");
		Flight back = airline.flightBooking("Londra", "Bucharest");
		
		
		
	}
	
}
