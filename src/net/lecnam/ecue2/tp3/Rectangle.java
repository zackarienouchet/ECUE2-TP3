package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur1;
    double longueur2;
    Point origine;

    public Rectangle(Point origine, double longueur1, double longueur2) {
        this.origine = origine;
        this.longueur1 = longueur1;
        this.longueur2 = longueur2;
    }

    public Rectangle(double x, double y, double longueur1, double longueur2) {
        this.origine = new Point(x, y);
        this.longueur1 = longueur1;
        this.longueur2 = longueur2;
    }

    public double retourneSurface() {
        return longueur1 * longueur2;
    }

    public void translate(double x, double y) {
        origine.translate(x, y);
    }
}