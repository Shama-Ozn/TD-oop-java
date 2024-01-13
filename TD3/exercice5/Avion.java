package exercice5;

public class Avion extends Vehicule {

    private int nbMoteur;

    public Avion(int nbPassager) {
        super(nbPassager);
    }

    public Avion(int nbPassager, int nbMoteur) {
        super(nbPassager);
        this.nbMoteur = nbMoteur;
    }

    @Override
    public String toString() {
        return "Avion : " + getNbPassager() + " passagers, " + nbMoteur + " moteurs";
    }
}
