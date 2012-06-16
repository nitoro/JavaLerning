package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.ticket.Ticket;
import jp.itacademy.samples.oop.ticket.TicketMachine;

public class Museum {
	
	public static void main(String[] args) {
		
		TicketMachine m1 = new TicketMachine("‚Ú‚¯”•¨ŠÙ@íİ“W", 500);
		TicketMachine m2 = new TicketMachine("‚Ú‚¯”•¨ŠÙ@íİ“W", 500);
		TicketMachine m3 = new TicketMachine("‚Ú‚¯”•¨ŠÙ@“Á•Ê“W", 800);
		
		m1.putMoney(1000);
		Ticket ticket1 = m1.getTicket();
		System.out.println(ticket1);
		System.out.println("‚¨’Ş‚èF " + m1.getChange());
		
		m2.putMoney(500);
		Ticket ticket2 = m2.getTicket();
		System.out.println(ticket2);
		
		m3.putMoney(800);
		Ticket ticket3 = m3.getTicket();
		System.out.println(ticket3);
	}
}
