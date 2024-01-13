public class LocationVelo {

    private static final int TARIF_JOUR = 100;
    private static final int HEURES_PAR_JOUR = 6;

    private int heureDebut, heureFin;

    public LocationVelo(int heureDebut, int heureFin) {
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public int calculerCout() {
        int jours = (heureFin - heureDebut > 10) ? 1 : 0;
        jours += (heureFin - heureDebut < HEURES_PAR_JOUR) ? 1 : 0;
        return TARIF_JOUR * jours;
    }

    public static void main(String[] args) {
        LocationVelo location = new LocationVelo(8, 15);
        System.out.println(location.calculerCout()); // Output: 200
    }
}
