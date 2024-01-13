package exercices1_2_3;

public class Cercle extends Centre {
    private int rayon;
    public Cercle(int x, int y, String nom, int rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }
    
    public void affiche() {
        super.affiche();
        System.out.println("Rayon du cercle : " + rayon);
    }
    
}
