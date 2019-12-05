package miage.fdel.bowling;

public class Jeu {
    private Essaie essaie1;
    private Essaie essaie2;

    public Jeu (Essaie essaie1, Essaie essaie2){
        this.essaie1 = essaie1;
        this.essaie2 = essaie2;
    }

    public Jeu (Essaie essaie1){
        this.essaie1 = essaie1;
        this.essaie2 = null;
    }

    public boolean isValid(){
        if(this.essaie1 == null
            || this.essaie2 == null && this.essaie1.getNbQuille() != 10
            || this.essaie2 != null && this.essaie1.getNbQuille() + this.essaie2.getNbQuille() > 10){
            return false;
        }
        return true;
    }

    public boolean isStrike(){
        return true;
    }

    public boolean isSpare(){
        return true;
    }

    public Essaie getEssaie1() {
        return essaie1;
    }

    public Essaie getEssaie2() {
        return essaie2;
    }
}
