package utils;

public class Livre {
	int nbreLivre = 0;
	static int counter = 0;
	int id = counter;
	String titre = "";
	String auteur = "";
	double prix = 0;
	
	public Livre(String titre, String auteur, double prix) {
		counter++;
		this.id = counter;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		nbreLivre++;
	}
	public String toString() {
		return "L'identifiant : "+id+" \n est le livre : "+titre+" de l'auteur : "+auteur+" est au prix de : "+prix+" € \n" ;
	}
	
	public static void afficheNbreLivre(Livre[] tab)
	{
		int max = tab.length;
		System.out.println("il y a : "+max+" livre(s)");
	}
}
