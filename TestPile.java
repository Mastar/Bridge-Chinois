/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 12/05/2012 : 00:01
Date de Dernière modification 12/05/2012 : 04:23
*/

import java.util.ArrayList;

public class TestPile {

	
	public static void main(String[] args) {
		Carte c1 = new Carte(Couleur.CARREAU, Rang.AS);
		Carte c2 = new Carte(Couleur.PIQUE, Rang.ROI);
		Carte c3 = new Carte(Couleur.COEUR, Rang.DAME);
		Carte c4 = new Carte(Couleur.TREFLE, Rang.VALET);
		Carte c5 = new Carte(Couleur.CARREAU, Rang.DIX);
		Carte c6 = new Carte(Couleur.PIQUE, Rang.DEUX);
		
		ArrayList<Carte> collection = new ArrayList<Carte>(6);
		collection.add(c1);
		collection.add(c2);
		collection.add(c3);
		collection.add(c4);
		collection.add(c5);
		collection.add(c6);
		
		System.out.println("J'instancie ma pile avec 6 cartes");
		Pile maPile = new Pile(1,collection);
		
		System.out.println("Ainsi ma pile ne dois pas être vide : ");
		
		if(maPile.estVide())
		{
			System.out.println("ERREUR");
		}
		else
		{
			System.out.println("REUSSI elle est de taille " + maPile.getPile().size());
		}
		
		System.out.println("Je pioche la première carte qui se trouve au dessus de la pile : le DEUX PIQUE :");
		Carte res = maPile.piocher();
		
		if(res.memeCouleur(c6))
		{
			System.out.println("la BONNE carte a été pioché");
		}
		else
		{
			System.out.println("la Mauvaise carte a été pioché");
		}
		
		System.out.println("Je pioche une deuxième carte qui se trouve au dessus de la pile : le DIX DE CARREAU :");
		res = maPile.piocher();
		
		if(res.memeCouleur(c5))
		{
			System.out.println("la BONNE carte a été pioché");
		}
		else
		{
			System.out.println("la Mauvaise carte a été pioché");
		}
		
		System.out.println("j'ai pioché 2 carte donc ma pile ne dois pas être vide et dois contenir 4 cartes: ");
		if(maPile.estVide() && maPile.getPile().size()==4)
		{
			System.out.println("ERREUR");
		}
		else
		{
			System.out.println("REUSSI la pile  de taille " + maPile.getPile().size());
		}
		System.out.println("je pioche les 4 cartes restantes");
		res = maPile.piocher();
		res = maPile.piocher();
		res = maPile.piocher();
		res = maPile.piocher();
		System.out.println("le dernière carte piocher dois être l'AS de CARREAU : ");
		if(res.getCouleur()==Couleur.CARREAU && res.getRang()==Rang.AS)
		{
			System.out.println("la BONNE carte a été pioché");
		}
		else
		{
			System.out.println("la Mauvaise carte a été pioché");
		}
		
		System.out.println("j'ai pioché toutes les cartes ma pile dois être vide maintenant :");
		if(maPile.estVide())
		{
			System.out.println("REUSSI taille :" + maPile.getPile().size());
			
		}
		else
		{
			System.out.println("ERREUR");
		}

	}

}
