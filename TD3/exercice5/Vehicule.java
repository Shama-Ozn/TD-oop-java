package exercice5;

public class Vehicule {
    private int nbPassager;

    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }
public int getNbPassager() {
    return nbPassager;
}
    @Override
    public String toString() {
        return "Véhicule : " + nbPassager;
    }
}
