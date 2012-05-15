/*!
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 14/05/2012 : 17:11
Date de Dernière modification 12/05/2012 : 17:48
*/

import java.util.ArrayList;

public class Table {
	
	// -------------------------------------Atributs-------------------------------------

	Main main1, main2;
	Carte carte1, carte2;
	ArrayList<Pile> piles;
	Paquet paquet;
	
	Table()
	{
		main1 = new Main();
		main2 = new Main();
		carte1 = null;
		carte2 = null;
		piles = new ArrayList<Pile>(6);
		for(int i=0;i<6;i++)
		{
			Pile pile = new Pile(i+1);
			piles.set(i,pile);
		}
		
		paquet = new Paquet();
		
	}
}
