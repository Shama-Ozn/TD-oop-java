package exercices1_2_3;

public class PointA extends Point {
    
    public PointA (int x, int y) {
        super( x, y);
    }
    public void affiche() {
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }
    
}
