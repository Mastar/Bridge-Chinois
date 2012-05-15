/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 12/05/2012 : 04:20
Date de Dernière modification 12/05/2012 : 18:54
*/

import java.util.ArrayList;


public class Pile {

	// -------------------------------------Attribute-------------------------------------
	int numero;
	ArrayList<Carte> pile;
	
	// -------------------------------------Constructor-------------------------------------
	Pile(int num)
	{
		numero = num;
		pile = new ArrayList<Carte>();
	}
	
	Pile(int num, ArrayList<Carte> p)
	{
		numero = num;
		pile = new ArrayList<Carte>(6);
		pile.addAll(p);
	}
	
	// -------------------------------------Accesseur-------------------------------------
	
	// renvoie le numero de la pile
	public int getNumero()
	{
		return numero;
	}
	
	// renvoie le contenue de la pile
	public ArrayList<Carte> getPile()
	{
		return pile;
	}
	
	// -------------------------------------Methode-------------------------------------
	
	// renvoie vrai si la pile est vide
	public boolean estVide()
	{
		return pile.isEmpty();
	}
	
	// renvoie la carte qui est au dessus de la pile (l'indice le plus grand)  et la retire de la pile
	public Carte piocher()
	{
		return pile.remove(pile.size()-1);
	}
}
