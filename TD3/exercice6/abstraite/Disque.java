package exercice6.abstraite;


import java.awt.Point;

public class Disque extends Figure{
    private Point centre;
    private double rayon;

    public Disque() {
        this(new Point(0, 0), 1);
    }

    public Disque(Point centre, double rayon) {
        this(centre, rayon, "Disque");
    }

    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre()
 
{
        return centre;
    }

    public
 
void
 
setCentre(Point centre)
 
{
        this.centre = centre;
    }

    public
 
double
 
getRayon()
 
{
        return rayon;
    }

    public
 
void
 
setRayon(double rayon)
 
{
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
        return "Disque{" +
                "nom='" + nom + '\'' +
                ", centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}
