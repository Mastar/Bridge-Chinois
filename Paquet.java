/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 12/05/2012 : 14:32
Date de Dernière modification 12/05/2012 : 18:54
*/

import java.util.ArrayList;
import java.util.Random;


public class Paquet {
	
	// -------------------------------------Atributs-------------------------------------
	ArrayList<Carte> paquet;
	
	
	
	// -------------------------------------Constructeur-------------------------------------
	Paquet()
	{
		paquet = new ArrayList<Carte>(52);
		for (Couleur couleur : Couleur.values())
		{
            for (Rang rang : Rang.values())
            {
                paquet.add(new Carte(couleur,rang));
                
            }
        }
	}
	
	// -------------------------------------Accesseur-------------------------------------
	
	// renvoie le paquet
	public ArrayList<Carte> getPaquet()
	{
		return paquet;
	}
	
	// renvoie la taille du paquet
	public int getTaille()
	{
		return paquet.size();
	}
	
	// -------------------------------------Methodes----------------------------------------
	
	// clone un paquet
	
	public Paquet clone()
	{
		Paquet resultat = new Paquet();
		resultat.copie(paquet);
		
		return resultat;
	}
	
	// copie le paquet
	
	public void copie(ArrayList<Carte> paquet)
	{
		this.paquet.clear();
		for(int i=0; i<paquet.size();i++)
		{
			Carte c = paquet.get(i);
			this.paquet.add(c);
		}
	}
	
	// pioche et renvoie la ième carte
	public Carte piocher(int i)
	{
		Carte resultat = paquet.remove(i);
		return resultat;
	}
	
	// pioche et renvoie la carte au dessus du paquet
	public Carte piocher()
		{
			Carte resultat = paquet.remove(paquet.size()-1);
			return resultat;
		}
	
	
	// melange un paquet
	public void melanger()
	{
		
		Paquet resultat = this.clone();
		Random rand;
		Carte c;
		
		paquet.clear();
		rand = new Random();
		
		while(!resultat.estVide())
		{
			int position = rand.nextInt(resultat.getTaille());
			c = resultat.piocher(position);
			paquet.add(c);
		}
		
	}
	
	// affiche le paquet dans la console
	public void afficherPaquetConsole()
	{
		for(int i=0;i<paquet.size();i++)
		{
			System.out.println( (i+1) + "- " + paquet.get(i).getRang() + " de " + paquet.get(i).getCouleur());
		}
	}
	
	// renvoie vrai si le paquet est vide
	public boolean estVide()
	{
		return paquet.isEmpty();
	}
}
