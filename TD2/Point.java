import java.util.Scanner;

public class Point {
     private char nomP ;
     private double xP ;
    
    public Point(char nomP, double xP){
        this.nomP= nomP;
        this.xP=xP;
    }
    public void translate(double transX){
        xP=xP+transX;
    }
    public void affiche(){
        System.out.println("Point : "  + nomP+"\t" + "absciss : " + xP );
    }
    public static void main (String [] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer le nom de votre point : ");
        char newp = scanner.next().charAt(0);
        System.out.println("entrer l'absciss de votre point : ");
        double newx = scanner.nextDouble();
        Point p = new Point(newp,newx);//param constr is defined now
        System.out.println("entrer la valeur de translation : ");
        double trans = scanner.nextDouble();
        p.affiche();
        p.translate(trans);
        System.out.println(" translation effectuee ");
        p.affiche();
        scanner.close();
    }
}
