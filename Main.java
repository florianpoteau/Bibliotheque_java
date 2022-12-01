package Livre.Bibliotheque_java;

import java.util.Scanner;
import java.io.IOException;

public class Main {
	
	/**
	 * @author florian poteau
	 */
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	
	
	public static void main(String[] args) throws IOException {
		
//		BIENVENUE
		
		Bibliotheque bibliotheque = new Bibliotheque();
		bibliotheque.list();
		

	    System.out.println("Bienvenue");
	    System.out.println("Pour voir les livres disponibles, tapez un caractère");
	    
//	    AFFICHAGE DES LIVRES DEPUIS LE CSV
	    
	    CsvImport csv = new CsvImport();
	    Scanner scan = new Scanner (System.in);
	    String sc = scan.next();
	    System.out.println(sc);
		csv.csv();
		condition();
	}
//		Choix du livre
		
	public static void condition() {
		
	    System.out.println("Quel livre voulait-vous?");
	    Scanner scann = new Scanner (System.in);
	    int sc1 = scann.nextInt();
	    
//	    Condition pour le livre 1
	    
	    if(sc1 == 1) {
	    	System.out.println("Vous avez choisis le livre : Le java de jean michel Doudoux ");
	    	System.out.println("Pour réserver ce livre");
	    	System.out.println("1 pour oui, 2 pour non");
	    	int str = scann.nextInt();
	    	
	    	if(str == 1) {
	    		System.out.println("Vous avez réserver le livre");
	    		System.out.println("Entrez un chiffre pour afficher la date d'aujourd'hui afin de calculer la date d'expiration du livre");
	    		Reservation réservation = new Reservation(null, str);
	    		réservation.getDate();
	    	}
	    	
	    	else if (str == 2) {
	    		System.out.println("Vous n'avez pas réserver le livre");
	    		condition();
	    	}
	    }
	    
//	    Condition livre 2
	    
	    else if(sc1 == 2) {
	    	System.out.println("Vous avez choisis le livre: Le combat d'un homme");
	    	System.out.println("Pour réserver ce livre");
	    	System.out.println("1 pour oui, 2 pour non");
	    	int str = scann.nextInt();
	    	if(str == 1) {
	    		System.out.println("Vous avez réserver le livre");
	    		System.out.println("Entrez un chiffre pour afficher la date d'aujourd'hui afin de calculer la date d'expiration du livre");
	    		Reservation réservation = new Reservation(null, str);
	    		réservation.getDate();
	    	}
	    	else if (str == 2) {
	    		System.out.println("Vous n'avez pas réserver le livre");
	    		condition();
	    	}
	    }
	    
//	    Condition livre 3
	    
	    else if(sc1 == 3) {
	    	System.out.println("Vous avez choisis le livre: Clip de rap");
	    	System.out.println("Pour réserver ce livre");
	    	System.out.println("1 pour oui, 2 pour non");
	    	int str = scann.nextInt();
	    	if(str == 1) {
	    		System.out.println("Vous avez réserver le livre");
	    		System.out.println("Entrez un chiffre pour afficher la date d'aujourd'hui afin de calculer la date d'expiration du livre");
	    		Reservation réservation = new Reservation(null, str);
	    		réservation.getDate();
	    	}
	    	else if (str == 2) {
	    		System.out.println("Vous n'avez pas réserver le livre");
	    		condition();
	    	}
	    }
	    
//	    Condition livre 4
	    
	    else if(sc1 == 4) {
	    	System.out.println("Vous avez choisis le livre: Le meilleur des meilleur");
	    	System.out.println("Pour réserver ce livre");
	    	System.out.println("1 pour oui, 2 pour non");
	    	int str = scann.nextInt();
	    	if(str == 1) {
	    		System.out.println("Vous avez réserver le livre");
	    		System.out.println("Entrez un chiffre pour afficher la date d'aujourd'hui afin de calculer la date d'expiration du livre");
	    		Reservation réservation = new Reservation(null, str);
	    		réservation.getDate();
	    	}
	    	else if (str == 2) {
	    		System.out.println("Vous n'avez pas réserver le livre");
	    		condition();
	    	}
	    }
	    
//	    Condition livre 5
	    
	    else if(sc1 == 5) {
	    	System.out.println("Vous avez choisis le livre: Harry Pother");
	    	System.out.println("Pour réserver ce livre");
	    	System.out.println("1 pour oui, 2 pour non");
	    	int str = scann.nextInt();
	    	if(str == 1) {
	    		System.out.println("Vous avez réserver le livre");
	    		System.out.println("Entrez un chiffre pour afficher la date d'aujourd'hui afin de calculer la date d'expiration du livre");
	    		Reservation réservation = new Reservation(null, str);
	    		réservation.getDate();
	    	}
	    	else if (str == 2) {
	    		System.out.println("Vous n'avez pas réserver le livre");
	    		condition();
	    	}
	    }
	}
	    
      
	}

