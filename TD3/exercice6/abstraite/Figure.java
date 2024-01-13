package exercice6.abstraite;

abstract class Figure {
    protected String nom;

    public Figure(String nom)
    {
        this.nom=nom;
    }
    public abstract double getPerimeter();

    public abstract double getAire();

    public String toString() {
        return "Nom de la figure : " + nom;
    }
}
