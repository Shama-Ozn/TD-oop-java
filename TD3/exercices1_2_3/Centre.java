package exercices1_2_3;

public class Centre extends Point  {
    private String nom;
    
    public Centre(int x, int y, String nom) {
        super(x,y);
        this.nom = nom;
    }
    public void affNom() {
        System.out.println("Nom du centre : " + nom);
    }
    
    public void affiche() {
        System.out.println("Coordonnées du centre " + nom + " : (" + getX() + ", " + getY() + ")");
    }
}
