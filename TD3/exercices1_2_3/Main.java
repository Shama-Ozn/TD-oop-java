package exercices1_2_3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        
        point.deplace(2, 3);
        
        PointA pointA = new PointA(1, 1);
        
        pointA.deplace(3, 3);
        pointA.affiche();
//___________________point Nom__________________
        PointNom pointNom = new PointNom(2, 5, "A");
        
        pointNom.affCoordNom();
        pointNom.setNom("B");
        pointNom.affCoordNom();
//_______________point____________________
        Centre centre = new Centre(3, 4, "C");
        centre.affiche();
        
        Cercle cercle = new Cercle(1, 1, "D", 5);
        cercle.affiche();
    }

}
