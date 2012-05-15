/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 12/05/2012 : 00:01
Date de Dernière modification 14/05/2012 : 04:08
*/
public class Carte {
	
	// -------------------------------------Attribute-------------------------------------
	Couleur couleur;
	Rang rang;
	
	// -------------------------------------Constructor-------------------------------------
	Carte(Couleur couleur, Rang rang)
	{
		this.couleur = couleur;
		this.rang = rang;
	}
	
	// -------------------------------------Accesseurs-------------------------------------
	
	// renvoie la couleur de la carte
	public Couleur getCouleur(){
		return couleur;
	}
	
	//renvoie le rang de la carte
	public Rang getRang(){
		return rang;
	}
	
	// -------------------------------------Methodes-------------------------------------
	
	// renvoi vrai si la carte est de la même couleur 
	public boolean memeCouleur(Carte c){
		return couleur == c.couleur;
	}
	
	// renvoi vrai si la carte est du même rang
	public boolean memeRang(Carte c){
			return rang == c.rang;
	}

	// renvoi vrai si la carte est plus forte que la carte c
	public boolean plusForte(Carte c)
	{
		if( this.memeCouleur(c))
		{
			return rang.getRang() > c.rang.getRang();
		}
		else
		{
			return c.couleur.getCouleur() < this.couleur.getCouleur() ;
		}
		
	}
	
	public String toString()
	{
		return this.rang + " de " + this.couleur;
	}
	
	
}
