package facade;

public class ProgMain {

	public static void main(String[] args) {
		/*
		 * Airline company = new Airline("CTS flights"); Flight toGo =
		 * company.flightBooking("Bucharest", "Cluj"); Flight back =
		 * company.flightBooking("Cluj", "Bucharest");
		 * 
		 * Hotel hotel = new Hotel("CTS Hotel"); hotel.roomBooking("cluj");
		 */
		
		Facade.reservation("Bucharest", "Cluj");
	}

}
