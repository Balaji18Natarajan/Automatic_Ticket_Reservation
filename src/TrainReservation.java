/**
 * 
 */

/**
 * @author balaji
 *
 */
 class RailwayReservation extends Reservation {
	 String train_name;
	 int no_of_tickets;
	 String booking_class;
 public RailwayReservation(String category, String customer_name,String trainName,int numberOfTickets,String bookingClass) {
		super(category, customer_name);
		this.train_name = trainName;
		this.no_of_tickets = numberOfTickets;
		this.booking_class = bookingClass;
 }
		public String getTrain_name() {
	return train_name;
}
public int getNo_of_tickets() {
	return no_of_tickets;
}
		// TODO Auto-generated constructor stub
		public void calculateAmount(){
			int amount;
			if(booking_class.equalsIgnoreCase("ac1")){
				amount = no_of_tickets * 1500;
				System.out.println("Amount :" +amount);
			}
			if(booking_class.equalsIgnoreCase("ac2")){
				amount = no_of_tickets * 1100;
				System.out.println("Amount :" +amount);
			}
			if(booking_class.equalsIgnoreCase("ac3")){
				amount = no_of_tickets * 700;
				System.out.println("Amount :" +amount);
			}
		}
	}


