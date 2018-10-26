
public class AirwaysReservation extends Reservation {
    String flight_name;
    int no_of_tickets;
    String booking_class;
    public AirwaysReservation(String category, String customer_name, String flightName, int numberOfTickets, String bookingClass) {
		super(category, customer_name);
		// TODO Auto-generated constructor stub
		this.flight_name = flightName;
		this.no_of_tickets = numberOfTickets;
		this.booking_class = bookingClass;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public int getNo_of_tickets() {
		return no_of_tickets;
	}
	public void calculateAmount(){
		int amount;
		if(booking_class.equalsIgnoreCase("business")){
			amount = no_of_tickets * 4500;
			System.out.println("Amount :" +amount);
		}
		if(booking_class.equalsIgnoreCase("economy")){
			amount = no_of_tickets * 3500;
			System.out.println("Amount :" +amount);
		}
	}
}
