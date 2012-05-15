/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 12/05/2012 : 16:32
Date de Derni�re modification 12/05/2012 : 18:54
*/

public class TestPaquet {

	
	public static void main(String[] args) {
		Paquet monPaquet = new Paquet();
		
		System.out.println("j'ai initialis� mon paquet de la plus petite carte � la plus forte : ");
		monPaquet.afficherPaquetConsole();
		
		System.out.println("je m�lange les carte : ");
		monPaquet.melanger();
		monPaquet.afficherPaquetConsole();
		
		System.out.println("je pioche la 11 �me carte");
		Carte c = monPaquet.piocher(10);
		System.out.println( c.getRang() + " de " + c.getCouleur());
		
		System.out.println("je pioche la carte au dessus du paquet");
		c = monPaquet.piocher();
		System.out.println( c.getRang() + " de " + c.getCouleur());
		
		System.out.println("je pioche ensuite 50 carte");
		for(int i=0; i<50;i++)
		{
			c = monPaquet.piocher();
		}
		
		System.out.println("la derni�re carte piocher est le " + c.getRang() + " de " + c.getCouleur());
		System.out.println("mon paquet dois �tre vide mtn :");
		if(monPaquet.estVide())
			System.out.println("VRAI");
		else
			System.out.println("FAUX");

	}

}
