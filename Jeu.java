/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 14/05/2012 : 03:21
Date de Dernière modification 12/05/2012 : 17:48
*/
import java.util.ArrayList;

public class Jeu {
	
	// -------------------------------------Atributs-----------------------------------------
	Table table;
	Joueur joueur1,joueur2;

	// -------------------------------------Constricteur-------------------------------------
	Jeu(Table t)
	{
		table = t;
	}
	
	// -------------------------------------Methodes-----------------------------------------
	
	public void initialiser()
	{
		for(int i=0; i<11;i++)
		{
			table.main1.add(table.paquet.piocher());
			table.main2.add(table.paquet.piocher());
		}
		
		for(int i=0;i<6;i++)
		{
			ArrayList<Carte> tas = new ArrayList<Carte>(5);
			for(int j=0;j<5;j++)
			{
				tas.add(table.paquet.piocher());
			}
			table.piles.get(i);
			
		}
	}

	
}
