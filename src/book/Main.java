package book;

import java.security.GeneralSecurityException;

import utils.Livre;

public class Main {

	public static void main(String[] args) {

			Livre[] livres = new Livre [3];
			
		livres[0] = new Livre("Les fleurs du mal"," Baudelaire", 20);
		livres[1] = new Livre("Les fleurs du bien"," Baudelaire", 21);
		livres[2] = new Livre("Les fleurs du milieu"," Baudelaire", 22);

		for (Livre livre : livres) {
			System.out.println(livre.toString());
		}
		
		Livre.afficheNbreLivre(livres);
	}

}
