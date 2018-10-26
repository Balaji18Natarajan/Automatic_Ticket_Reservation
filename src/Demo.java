
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RailwayReservation objRailReservation = new RailwayReservation("train","ashok","rajdhani",2,"ac2");
     AirwaysReservation objAirTicketReservation = new AirwaysReservation("flight","anjana","airindia",3,"economy");
     System.out.println("Transaction Number: "  +objRailReservation.getTransactionNumber());
     System.out.println("Ticket Category :" +objRailReservation.getCategory());
     System.out.println("Customer Name :" +objRailReservation.getCustomer_name());
     System.out.println("Train Name : " +objRailReservation.getTrain_name());
     System.out.println("Number Of Tickets : " +objRailReservation.getNo_of_tickets());
     objRailReservation.calculateAmount();
     System.out.println("Transaction Number: "  +objAirTicketReservation.getTransactionNumber());
     System.out.println("Ticket Category :" +objAirTicketReservation.getCategory());
     System.out.println("Customer Name :" +objAirTicketReservation.getCustomer_name());
     System.out.println("Flight Name : " +objAirTicketReservation.getFlight_name());
     System.out.println("Number Of Tickets : " +objAirTicketReservation.getNo_of_tickets());
     objAirTicketReservation.calculateAmount();
	}

}
