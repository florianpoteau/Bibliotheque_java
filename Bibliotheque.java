package Livre.Bibliotheque_java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Bibliotheque {
	
	private static final String DELIMITER = ",";
    private static final String SEPARATOR = "\n";
    
    private static final String HEADER = "Titre,Auteur,genre, nombre de pages, nombre d'exemplaire";
	private Livre v1;
	private Livre v2;
	private Livre v3;
	private Livre v4;
	private Livre v5;
	private Livre v6;
	
	
	
	public void list() {
		
//		Entrée des livres vers le csv
		
		this.v1 = new Livre ("Tapez 1 pour: ","Le java de jean michel Doudoux ", "De Yves bondu ", "livre d'action ", 150,"pages", 3, "exemplaires");
		this.v2 = new Livre ("Tapez 2 pour: ","Le combat d'un homme ","De Yves Bondu ", "livre Policier ", 230, "pages", 1, "exemplaire");
	    this.v3 = new Livre ("Tapez 3 pour: ","Clip de rap ", "De Therese Dune ", "livre d'aventure ", 50, "pages", 2, "exemplaires");
	    this.v4 = new Livre ("Tapez 4 pour: ","Le meilleur des meilleur ","De Duwelz Theo ", "livre theatre ", 210, "pages", 3, "exemplaires");
	    this.v5 = new Livre ("Tapez 5 pour: ","Harry Pother ", "De jk Rowling ", "livre d'action ", 110, "pages", 1, "exemplaire");
		
	    
//		LISTE

	List bookList = new ArrayList();
    bookList.add(v1);
    bookList.add(v2);
    bookList.add(v3);
    bookList.add(v4);
    bookList.add(v5);
	
FileWriter file = null;
	
	try
    {
      file = new FileWriter("Book.csv");
      //Ajouter l'en-tête
      file.append(HEADER);
      //Ajouter une nouvelle ligne après l'en-tête
      file.append(SEPARATOR);
      //Itérer bookList
      Iterator it = bookList.iterator();
      while(it.hasNext())
      {
        Livre l = (Livre)it.next();
        file.append(l.getScanner());
        file.append(DELIMITER);
        file.append(l.getTitre());
        file.append(DELIMITER);
        file.append(l.getAuteur());
        file.append(DELIMITER);
        file.append(l.getGenre());
        file.append(DELIMITER);
        file.append(String.valueOf(l.getNbrpage()));
        file.append(DELIMITER);
        file.append(l.getPages());
        file.append(DELIMITER);
        file.append(String.valueOf(l.getNbrexemplaire()));
        file.append(DELIMITER);
        file.append(l.getExemplaires());
        file.append(SEPARATOR);
      }
    
      file.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
	}
	
//	Selection des livres par l'utilisateur
	
	

	/**
	 * @return the v1
	 */
	public Livre getV1() {
		return v1;
	}

	/**
	 * @param v1 the v1 to set
	 */
	public void setV1(Livre v1) {
		this.v1 = v1;
	}

	/**
	 * @return the v2
	 */
	public Livre getV2() {
		return v2;
	}

	/**
	 * @param v2 the v2 to set
	 */
	public void setV2(Livre v2) {
		this.v2 = v2;
	}

	/**
	 * @return the v3
	 */
	public Livre getV3() {
		return v3;
	}

	/**
	 * @param v3 the v3 to set
	 */
	public void setV3(Livre v3) {
		this.v3 = v3;
	}

	/**
	 * @return the v4
	 */
	public Livre getV4() {
		return v4;
	}

	/**
	 * @param v4 the v4 to set
	 */
	public void setV4(Livre v4) {
		this.v4 = v4;
	}

	/**
	 * @return the v5
	 */
	public Livre getV5() {
		return v5;
	}

	/**
	 * @param v5 the v5 to set
	 */
	public void setV5(Livre v5) {
		this.v5 = v5;
	}

	/**
	 * @return the v6
	 */
	public Livre getV6() {
		return v6;
	}

	/**
	 * @param v6 the v6 to set
	 */
	public void setV6(Livre v6) {
		this.v6 = v6;
	}

	}
