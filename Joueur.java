/*
Auteur : ZIANE-CHERIF Mohammed-El-Amine
Date de Creation 14/05/2012 : 03:15
Date de Dernière modification 12/05/2012 : 04:14
*/

public abstract class Joueur {

	
	// -------------------------------------Atributs-------------------------------------
	
    Jeu j;
    int score;
    Main main;
    

	// -------------------------------------Accesseurs-------------------------------------

    public int getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
    public Main getMain()
    {
    	return main;
    }

	// -------------------------------------Constructeur-------------------------------------

    
    abstract void jouer();
}
