package facade;

public class ProgMain {

	public static void main(String[] args) {
//		Hotel hotel = new Hotel("London Hilton");
//		hotel.roomBooking("London");
//		
//		
//		Airline airline = new Airline("BlueAir");
//		Flight toGo = airline.flightBooking("Bucharest", "Londra");
//		Flight back = airline.flightBooking("Londra", "Bucharest");
		
		//facade
		
		Facade.reservation("Bucharest", "Londra");
	}
	
}
