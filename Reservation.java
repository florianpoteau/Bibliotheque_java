package Livre.Bibliotheque_java;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Reservation {

	private String réservation;
	private int date;
	Scanner scan = new Scanner (System.in);
	
	
	public Reservation(String réservation, int date) {
		this.réservation = réservation;
		this.date = scan.nextInt();
	}

	/**
	 * @return the réservation
	 */
	public String getRéservation() {
		return réservation;
	}

	/**
	 * @param réservation the réservation to set
	 */
	public void setRéservation(String réservation) {
		this.réservation = réservation;
	}

	/**
	 * @return the date
	 */
	public int getDate() {

		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTimeInMillis(date);

	    Calendar calendar = Calendar.getInstance();
	    calendar.setTimeInMillis(new Date().getTime());
	    
	    // 2 mois d'expiration
	    
	    calendar.add(calendar.MONTH, 2);  
	    System.out.println("Le livre arrivera a expiration dans 2 mois le: "+ new Date(calendar.getTime().getTime()));

		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}

}
