/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 14/05/2012 : 15:21
Date de Derni�re modification 12/05/2012 : 17:02
*/
import java.util.ArrayList;


public class TestMain {

	public static void main(String[] args) {
		
		// j'initialise une main vide
		
		Main m1 = new Main();
		
		// test si ma main est bien vide
		if(m1.estVide())
			System.out.println("TEST REUSSI : MA MAIN EST VIDE");
		
		// j'initialise un paquet et je le m�lange
		Paquet p = new Paquet();
		p.melanger();
		System.out.println("j'initialise un paquet et je le m�lange :");

		p.afficherPaquetConsole();
		
		// je pioche 11 carte et je les rajoute dans ma main
		System.out.println("je pioche 11 cartes et je trie au fur et � mesure que je pioche");

		for(int i=0;i<11;i++)
		{
			m1.add(p.piocher());
		}
			
		
		// test si ma main n'est pas vide
		if(!m1.estVide())
			System.out.println("TEST REUSSI : MA MAIN N'EST PAS VIDE");
		
		// j'affiche ma main
		System.out.println("voici ma main, elle dois �tre tri�");

		m1.afficherMainConsole();
		

		
		ArrayList<Carte> collection2 = new ArrayList<Carte>(11);
		System.out.println("j'initialise une nouvelle main sans tri�");

		for(int i=0; i<11;i++)
		{
			collection2.add(p.piocher());
		}
		
		Main m2 = new Main(collection2);
		System.out.println("j'affiche ma main non trie : ");
		m2.afficherMainConsole();
		m2.trier();
		System.out.println("j'affiche ma main apres le trie par fusion : ");
		m2.afficherMainConsole();
		
		
	}

}
