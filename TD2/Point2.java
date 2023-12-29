import java.util.Scanner;

public class Point2 {
    private double x;
    private double y;
    private double z;
    private char point;
    public Point2()
    {
        this.point = 'O';
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Point2(char point,double x, double y,double z)
    {
        this.point =point;
        this.x=x;
        this.y= y;
        this.z=z;
    }
    public char getPoint()
    {
        return point;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getZ()
    {
        return z;
    }
    public void setPoint(char p)
    {
        point=p;
    }
    public void setX(double xp)
    {
        x=xp;
    }
    public void setY( double yp)
    {
        y=yp;
    }
    public void setZ( double zp)
    {
        z=zp;
    }
    public double norme(double x, double y, double z)
    {
        double n = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
        return n;
    }
    public static void main(String [] args)
    {
        Point2 p2 = new Point2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your point: ");
        char p = scanner.next().charAt(0);
        p2.setPoint(p);
        System.out.println("entrer x : ");
        double xp = scanner.nextDouble();
        p2.setX(xp);
        System.out.println("entrer y: ");
        double yp = scanner.nextDouble();
        p2.setY(yp);
        System.out.println("entrer z: ");
        double zp = scanner.nextDouble();
        p2.setZ(zp);
        System.out.println("your point is : " + p2.getPoint()+" ("+ p2.getX()+","+ p2.getY()+","+ p2.getZ()+")");
        System.out.println("the norm is  :");
        System.out.println(p2.norme(xp,yp,zp)); 
        scanner.close();
    }
}