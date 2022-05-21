package Day5;

public class Ticket {
	private  int ticketid;
	private int price;
	static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	
	public int calculateTicketCost(int nooftickets) {
		int totalPrice=0;
		if(availableTickets>0) {
			totalPrice=nooftickets*price;
			return totalPrice;
		}
		else {
			return -1;
		}
	}
	
}
