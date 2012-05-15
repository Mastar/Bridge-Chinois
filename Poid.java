/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 12/05/2012 : 00:01
Date de Dernière modification 12/05/2012 : 18:54
*/

enum Rang {
	DEUX(0),TROIS(1),QUATRE(2),CINQ(3),SIX(4),SEPT(5),HUIT(6),
	NEUF(7),DIX(8),VALET(9),DAME(10),ROI(11),AS(12);
	
	// -------------------------------------Attribute-------------------------------------
	int rang;
	
	// -------------------------------------Constructor-------------------------------------
	Rang(int i)
	{
		rang = i;
	}
	
	// -------------------------------------Accesseur-------------------------------------
	public int getRang()
	{
		return rang;
	}
}
