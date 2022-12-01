package Livre.Bibliotheque_java;

public class Livre {

	private String scanner;
private String auteur;
private String titre;
private String genre;
private int nbrpage;
private String pages;
private int nbrexemplaire;
private String exemplaires;

public Livre (String scanner, String titre,String auteur, String genre, int nbrpage, String pages, int nbrexemplaire, String exemplaires) {
	
	this.scanner = scanner;
	this.auteur = auteur;
	this.titre = titre;
	this.genre = genre;
	this.nbrpage = nbrpage;
	this.pages = pages;
	this.nbrexemplaire = nbrexemplaire;
	this.exemplaires = exemplaires;
}

/**
 * @return the scanner
 */
public String getScanner() {
	return scanner;
}

/**
 * @param scanner the scanner to set
 */
public void setScanner(String scanner) {
	this.scanner = scanner;
}

/**
 * @return the pages
 */
public String getPages() {
	return pages;
}

/**
 * @param pages the pages to set
 */
public void setPages(String pages) {
	this.pages = pages;
}

/**
 * @return the exemplaires
 */
public String getExemplaires() {
	return exemplaires;
}

/**
 * @param exemplaires the exemplaires to set
 */
public void setExemplaires(String exemplaires) {
	this.exemplaires = exemplaires;
}

/**
 * @return the nbrexemplaire
 */
public int getNbrexemplaire() {
	return nbrexemplaire;
}

/**
 * @param nbrexemplaire the nbrexemplaire to set
 */
public void setNbrexemplaire(int nbrexemplaire) {
	this.nbrexemplaire = nbrexemplaire;
}

public void setup (String titre, String auteur) {
	this.titre= titre;
	this.auteur = auteur;
}

/**
 * @return the auteur
 */
public String getAuteur() {
	return auteur;
}

/**
 * @param auteur the auteur to set
 */
public void setAuteur(String auteur) {
	this.auteur = auteur;
}

/**
 * @return the titre
 */
public String getTitre() {
	return titre;
}

/**
 * @param titre the titre to set
 */
public void setTitre(String titre) {
	this.titre = titre;
}

/**
 * @return the genre
 */
public String getGenre() {
	return genre;
}

/**
 * @param genre the genre to set
 */
public void setGenre(String genre) {
	this.genre = genre;
}

/**
 * @return the nbrpage
 */
public int getNbrpage() {
	return nbrpage;
}

/**
 * @param nbrpage the nbrpage to set
 */
public void setNbrpage(int nbrpage) {
	this.nbrpage = nbrpage;
}


}
