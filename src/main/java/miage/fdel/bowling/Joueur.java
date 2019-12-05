package miage.fdel.bowling;

import java.util.List;

public class Joueur {
    private List<Jeu> jeux;
    private CalculerScore calculScore;

    public Joueur(List<Jeu> jeux, CalculerScore calculScore){
        this.jeux = jeux;
        this.calculScore = calculScore;
    }

}
