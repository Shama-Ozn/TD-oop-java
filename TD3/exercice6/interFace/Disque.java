package exercice6.interFace;

import java.awt.Point;

public class Disque implements Figure {
    private Point centre;
    private double rayon;
    private String nom;

    public Disque() {
        this.centre = new Point(0, 0);
        this.rayon = 0.0;
    }

    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(Point centre, double rayon, String nom) {
        this.centre = centre;
        this.rayon = rayon;
        this.nom = nom;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Nom de la figure : " + nom;
    }
}

