package exercice6.abstraite;

public class Rectangle extends Figure {

    private double longueur;
    private double largeur;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double longueur, double largeur) {
        this(longueur, largeur, "Rectangle");
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "nom='" + nom + '\'' +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}

