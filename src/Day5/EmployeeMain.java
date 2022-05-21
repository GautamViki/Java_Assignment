package Day5;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ticketid : ");
		int id=sc.nextInt();
		
		System.out.print("Enter the price: ");
		int price=sc.nextInt();
		
		System.out.print("Enter the no of tickets : ");
		int bookedTicket=sc.nextInt();
		
		System.out.println("Available tickets: ");
		int avTicket=sc.nextInt();
		
		Ticket tic=new Ticket();
		tic.setPrice(price);
		tic.setTicketid(id);
		tic.setAvailableTickets(avTicket);
		
		System.out.println();
		int total=tic.calculateTicketCost(bookedTicket);
		System.out.println("Total amount: "+total);
		
		int remain =avTicket-bookedTicket;
		System.out.println("Available ticket after booking : "+remain);
}

}
