package exercice5;

public class Triporteur extends Moto {
    private int nbRoues = 3;

    public Triporteur(int nbPassager) {
        super(nbPassager);
    }

    @Override
    public String toString() {
        return "Triporteur : " + getNbPassager()+ " passagers, " + nbRoues + " roues";
    }
}
